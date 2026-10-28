package pulse;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ElapsedTimer {
    private static final ZoneId DEFAULT_ZONE = ZoneId.systemDefault();
    private static final DateTimeFormatter DEFAULT_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private long lastResetMs = System.currentTimeMillis();

    public boolean hasElapsed(long delayMs) {
        return this.elapsedMs() >= delayMs;
    }

    public long elapsedMs() {
        return System.currentTimeMillis() - this.lastResetMs;
    }

    public void reset() {
        this.lastResetMs = System.currentTimeMillis();
    }

    public void setLastResetMs(long lastResetMs) {
        this.lastResetMs = lastResetMs;
    }

    public static long currentEpochMs() {
        return Instant.now().atZone(DEFAULT_ZONE).toInstant().toEpochMilli();
    }

    public static ZonedDateTime currentDateTime() {
        return ZonedDateTime.now(DEFAULT_ZONE);
    }

    public static String formatEpochMs(long epochMs) {
        return Instant.ofEpochMilli(epochMs).atZone(DEFAULT_ZONE).format(DEFAULT_FORMAT);
    }

    public static String formatNow() {
        return currentDateTime().format(DEFAULT_FORMAT);
    }

    public static boolean isDifferenceGreaterThan(long firstMs, long secondMs, long allowedDifferenceMs) {
        return Math.abs(firstMs - secondMs) > allowedDifferenceMs;
    }

    public static long differenceMs(long firstMs, long secondMs) {
        return Math.abs(firstMs - secondMs);
    }

    public static String formatNowWithZone() {
        ZonedDateTime now = currentDateTime();
        return String.format("%s %s", now.format(DEFAULT_FORMAT), now.getOffset());
    }

    public boolean a(long delayMs) {
        return this.hasElapsed(delayMs);
    }

    public long a() {
        return this.elapsedMs();
    }

    public void b() {
        this.reset();
    }

    public static long c() {
        return currentEpochMs();
    }

    public static ZonedDateTime d() {
        return currentDateTime();
    }

    public static String b(long epochMs) {
        return formatEpochMs(epochMs);
    }

    public static String e() {
        return formatNow();
    }

    public static boolean a(long firstMs, long secondMs, long allowedDifferenceMs) {
        return isDifferenceGreaterThan(firstMs, secondMs, allowedDifferenceMs);
    }

    public static long a(long firstMs, long secondMs) {
        return differenceMs(firstMs, secondMs);
    }

    public static String f() {
        return formatNowWithZone();
    }

    public void c(long lastResetMs) {
        this.setLastResetMs(lastResetMs);
    }
}
