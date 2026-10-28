package pulse;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.Locale;
import java.util.Random;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.FloatControl.Type;

public final class SoundPlayer {
    private static final String SOUND_DIR = "assets/pulse/sounds/";
    private static final Random RANDOM = new Random();

    private SoundPlayer() {
    }

    public static void play(String soundName, float volume) {
        if (soundName == null || soundName.isBlank()) {
            playRandomHit(volume);
            return;
        }

        playResource(SOUND_DIR + soundName.toLowerCase(Locale.ROOT) + ".wav", volume);
    }

    public static void playRandomHit(float volume) {
        int hitSound = RANDOM.nextInt(3) + 1;
        playResource(SOUND_DIR + "hit" + hitSound + ".wav", volume);
    }

    private static void playResource(String resourcePath, float volume) {
        Thread thread = new Thread(() -> {
            try (InputStream stream = SoundPlayer.class.getClassLoader().getResourceAsStream(resourcePath)) {
                if (stream == null) {
                    return;
                }

                try (BufferedInputStream bufferedStream = new BufferedInputStream(stream);
                     AudioInputStream audioStream = AudioSystem.getAudioInputStream(bufferedStream)) {
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioStream);
                    applyVolume(clip, volume);
                    clip.start();
                    clip.addLineListener(event -> {
                        if (event.getType() == javax.sound.sampled.LineEvent.Type.STOP) {
                            clip.close();
                        }
                    });
                }
            } catch (Exception ignored) {
            }
        }, "Pulse Sound Player");
        thread.setDaemon(true);
        thread.start();
    }

    private static void applyVolume(Clip clip, float volume) {
        if (!clip.isControlSupported(Type.MASTER_GAIN)) {
            return;
        }

        FloatControl gain = (FloatControl)clip.getControl(Type.MASTER_GAIN);
        float safeVolume = Math.max(0.01F, volume);
        float gainDb = (float)(20.0 * Math.log10(safeVolume));
        gain.setValue(Math.max(gain.getMinimum(), Math.min(gainDb, gain.getMaximum())));
    }
}
