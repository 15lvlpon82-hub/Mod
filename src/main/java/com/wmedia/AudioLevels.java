package com.wmedia;

public final class AudioLevels {
    private final float masterPeak;
    private final float leftPeak;
    private final float rightPeak;

    public AudioLevels(float masterPeak, float leftPeak, float rightPeak) {
        this.masterPeak = masterPeak;
        this.leftPeak = leftPeak;
        this.rightPeak = rightPeak;
    }

    public float getMasterPeak() {
        return masterPeak;
    }

    public float getLeftPeak() {
        return leftPeak;
    }

    public float getRightPeak() {
        return rightPeak;
    }
}
