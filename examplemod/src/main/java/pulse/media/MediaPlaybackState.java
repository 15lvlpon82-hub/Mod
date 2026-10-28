package pulse;

import java.util.Arrays;

public class MediaPlaybackState {
   private static final float SMALL_POSITION_JUMP_MS = 100.0F;
   private static final float LARGE_POSITION_JUMP_MS = 1000.0F;
   private static final float SEEK_CONFIRM_WINDOW_MS = 2000.0F;

   private String title = "";
   private String artist = "";
   private byte[] artwork = new byte[0];
   private boolean artworkChanged;
   private boolean playing;
   private float durationMs;
   private float positionMs;
   private long positionTimestampMs;
   private float lastSourcePositionMs;
   private boolean forcedPlaying;
   private boolean hasForcedPlaying;
   private boolean fixedPosition;
   private float fixedPositionMs;
   private boolean waitingForSeekConfirmation;
   private float seekBasePositionMs;
   private boolean mediaCardVisible;
   private boolean showTrackChanged;
   private boolean showPlaybackStopped;
   private boolean wasPlaying;
   private String lastTitle = "";
   private final float[] spectrum = new float[6];

   public float currentPositionMs() {
      if (this.fixedPosition) {
         return this.fixedPositionMs;
      }

      if (this.waitingForSeekConfirmation) {
         if (this.isPlaying() && this.positionTimestampMs > 0L) {
            float elapsedPosition = this.seekBasePositionMs + (float)(System.currentTimeMillis() - this.positionTimestampMs);
            return this.durationMs > 0.0F ? Math.min(elapsedPosition, this.durationMs) : elapsedPosition;
         }

         return this.seekBasePositionMs;
      }

      if (this.isPlaying() && this.positionTimestampMs > 0L) {
         float elapsedPosition = this.positionMs + (float)(System.currentTimeMillis() - this.positionTimestampMs);
         return this.durationMs > 0.0F ? Math.min(elapsedPosition, this.durationMs) : elapsedPosition;
      }

      return this.positionMs;
   }

   public float progress() {
      return this.durationMs > 0.0F ? Math.max(0.0F, Math.min(1.0F, this.currentPositionMs() / this.durationMs)) : 0.0F;
   }

   public boolean isPlaying() {
      return this.hasForcedPlaying ? this.forcedPlaying : this.playing;
   }

   public void forcePlaying(boolean playing) {
      float currentPosition = this.currentPositionMs();
      this.forcedPlaying = playing;
      this.hasForcedPlaying = true;
      this.positionMs = currentPosition;
      this.positionTimestampMs = System.currentTimeMillis();
   }

   public void clearForcedPlaying() {
      this.hasForcedPlaying = false;
   }

   public void freezePosition(float positionMs) {
      this.fixedPosition = true;
      this.fixedPositionMs = positionMs;
      this.waitingForSeekConfirmation = false;
   }

   public void setFrozenPosition(float positionMs) {
      this.fixedPositionMs = positionMs;
   }

   public void startSeekConfirmation() {
      this.fixedPosition = false;
      this.waitingForSeekConfirmation = true;
      this.seekBasePositionMs = this.fixedPositionMs;
      this.positionTimestampMs = System.currentTimeMillis();
   }

   public void update(String title, String artist, boolean playing, float positionMs, float durationMs, byte[] artwork) {
      boolean sameTrack = this.title.equals(title);

      this.title = title;
      this.artist = artist;
      if (artwork != null && artwork.length > 0 && !Arrays.equals(this.artwork, artwork)) {
         this.artwork = artwork;
         this.artworkChanged = true;
      }

      this.playing = playing;
      this.durationMs = durationMs;
      if (sameTrack) {
         if (this.hasForcedPlaying && this.forcedPlaying == playing) {
            this.clearForcedPlaying();
         }

         if (this.waitingForSeekConfirmation) {
            if (Math.abs(positionMs - this.seekBasePositionMs) < SEEK_CONFIRM_WINDOW_MS) {
               this.waitingForSeekConfirmation = false;
               this.positionMs = positionMs;
               this.positionTimestampMs = System.currentTimeMillis();
               this.lastSourcePositionMs = positionMs;
            }
            return;
         }

         if (!this.fixedPosition) {
            if (Math.abs(positionMs - this.lastSourcePositionMs) < SMALL_POSITION_JUMP_MS) {
               return;
            }

            this.lastSourcePositionMs = positionMs;
            if (Math.abs(this.currentPositionMs() - positionMs) > LARGE_POSITION_JUMP_MS) {
               this.positionMs = positionMs;
               this.positionTimestampMs = System.currentTimeMillis();
            }
         }
      } else {
         this.positionMs = positionMs;
         this.positionTimestampMs = System.currentTimeMillis();
         this.lastSourcePositionMs = positionMs;
         this.clearForcedPlaying();
         this.fixedPosition = false;
         this.waitingForSeekConfirmation = false;
      }
   }

   public void clearArtworkChanged() {
      this.artworkChanged = false;
   }

   public float currentPositionSeconds() {
      return this.currentPositionMs() / 1000.0F;
   }

   public float durationSeconds() {
      return this.durationMs / 1000.0F;
   }

   public void showMediaCard() {
      this.mediaCardVisible = true;
   }

   public void hideMediaCard() {
      this.mediaCardVisible = false;
   }

   public boolean consumeTrackChanged() {
      if (!this.showTrackChanged) {
         return false;
      }

      this.showTrackChanged = false;
      return true;
   }

   public boolean consumePlaybackStopped() {
      if (!this.showPlaybackStopped) {
         return false;
      }

      this.showPlaybackStopped = false;
      return true;
   }

   public void updateNotificationFlags() {
      boolean currentlyPlaying = this.isPlaying();
      boolean titleChanged = !this.title.equals(this.lastTitle);
      if (titleChanged && !this.title.isBlank()) {
         this.showTrackChanged = true;
         this.mediaCardVisible = true;
      }

      if (currentlyPlaying && !this.wasPlaying) {
         this.showTrackChanged = true;
         this.mediaCardVisible = true;
      }

      if (!currentlyPlaying && this.wasPlaying && !this.mediaCardVisible) {
         this.showPlaybackStopped = true;
      }

      this.wasPlaying = currentlyPlaying;
      this.lastTitle = this.title;
   }

   public String title() {
      return this.title;
   }

   public String artist() {
      return this.artist;
   }

   public byte[] artwork() {
      return this.artwork;
   }

   public boolean artworkChanged() {
      return this.artworkChanged;
   }

   public boolean rawPlaying() {
      return this.playing;
   }

   public float durationMs() {
      return this.durationMs;
   }

   public float basePositionMs() {
      return this.positionMs;
   }

   public long positionTimestampMs() {
      return this.positionTimestampMs;
   }

   public float lastSourcePositionMs() {
      return this.lastSourcePositionMs;
   }

   public boolean forcedPlaying() {
      return this.forcedPlaying;
   }

   public boolean hasForcedPlaying() {
      return this.hasForcedPlaying;
   }

   public boolean fixedPosition() {
      return this.fixedPosition;
   }

   public float fixedPositionMs() {
      return this.fixedPositionMs;
   }

   public boolean waitingForSeekConfirmation() {
      return this.waitingForSeekConfirmation;
   }

   public float seekBasePositionMs() {
      return this.seekBasePositionMs;
   }

   public boolean mediaCardVisible() {
      return this.mediaCardVisible;
   }

   public boolean trackChangedQueued() {
      return this.showTrackChanged;
   }

   public boolean playbackStoppedQueued() {
      return this.showPlaybackStopped;
   }

   public boolean wasPlaying() {
      return this.wasPlaying;
   }

   public String lastTitle() {
      return this.lastTitle;
   }

   public float[] spectrum() {
      return this.spectrum;
   }

   public float a() {
      return this.currentPositionMs();
   }

   public float b() {
      return this.progress();
   }

   public boolean c() {
      return this.isPlaying();
   }

   public void a(boolean playing) {
      this.forcePlaying(playing);
   }

   public void d() {
      this.clearForcedPlaying();
   }

   public void a(float positionMs) {
      this.freezePosition(positionMs);
   }

   public void b(float positionMs) {
      this.setFrozenPosition(positionMs);
   }

   public void e() {
      this.startSeekConfirmation();
   }

   public void a(String title, String artist, boolean playing, float positionMs, float durationMs, byte[] artwork) {
      this.update(title, artist, playing, positionMs, durationMs, artwork);
   }

   public void f() {
      this.clearArtworkChanged();
   }

   public float g() {
      return this.currentPositionSeconds();
   }

   public float h() {
      return this.durationSeconds();
   }

   public void i() {
      this.showMediaCard();
   }

   public void j() {
      this.hideMediaCard();
   }

   public boolean k() {
      return this.consumeTrackChanged();
   }

   public boolean l() {
      return this.consumePlaybackStopped();
   }

   public void m() {
      this.updateNotificationFlags();
   }

   public String n() {
      return this.title();
   }

   public String o() {
      return this.artist();
   }

   public byte[] p() {
      return this.artwork();
   }

   public boolean q() {
      return this.artworkChanged();
   }

   public boolean r() {
      return this.rawPlaying();
   }

   public float s() {
      return this.durationMs();
   }

   public float t() {
      return this.basePositionMs();
   }

   public long u() {
      return this.positionTimestampMs();
   }

   public float v() {
      return this.lastSourcePositionMs();
   }

   public boolean w() {
      return this.forcedPlaying();
   }

   public boolean x() {
      return this.hasForcedPlaying();
   }

   public boolean y() {
      return this.fixedPosition();
   }

   public float z() {
      return this.fixedPositionMs();
   }

   public boolean A() {
      return this.waitingForSeekConfirmation();
   }

   public float B() {
      return this.seekBasePositionMs();
   }

   public boolean C() {
      return this.mediaCardVisible();
   }

   public boolean D() {
      return this.trackChangedQueued();
   }

   public boolean E() {
      return this.playbackStoppedQueued();
   }

   public boolean F() {
      return this.wasPlaying();
   }

   public String G() {
      return this.lastTitle();
   }

   public float[] H() {
      return this.spectrum();
   }

   public void a(String title) {
      this.title = title;
   }

   public void b(String artist) {
      this.artist = artist;
   }

   public void a(byte[] artwork) {
      this.artwork = artwork;
   }

   public void b(boolean artworkChanged) {
      this.artworkChanged = artworkChanged;
   }

   public void c(boolean playing) {
      this.playing = playing;
   }

   public void c(float durationMs) {
      this.durationMs = durationMs;
   }

   public void d(float positionMs) {
      this.positionMs = positionMs;
   }

   public void a(long positionTimestampMs) {
      this.positionTimestampMs = positionTimestampMs;
   }

   public void e(float lastSourcePositionMs) {
      this.lastSourcePositionMs = lastSourcePositionMs;
   }

   public void d(boolean hasForcedPlaying) {
      this.hasForcedPlaying = hasForcedPlaying;
   }

   public void e(boolean fixedPosition) {
      this.fixedPosition = fixedPosition;
   }

   public void f(float fixedPositionMs) {
      this.fixedPositionMs = fixedPositionMs;
   }

   public void f(boolean waitingForSeekConfirmation) {
      this.waitingForSeekConfirmation = waitingForSeekConfirmation;
   }

   public void g(float seekBasePositionMs) {
      this.seekBasePositionMs = seekBasePositionMs;
   }

   public void g(boolean mediaCardVisible) {
      this.mediaCardVisible = mediaCardVisible;
   }

   public void h(boolean showTrackChanged) {
      this.showTrackChanged = showTrackChanged;
   }

   public void i(boolean showPlaybackStopped) {
      this.showPlaybackStopped = showPlaybackStopped;
   }

   public void j(boolean wasPlaying) {
      this.wasPlaying = wasPlaying;
   }

   public void c(String lastTitle) {
      this.lastTitle = lastTitle;
   }
}
