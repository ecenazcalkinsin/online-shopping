class Warranty {
    private int duration;
    private String coverageType;

    // Constructor
    public Warranty(int duration, String coverageType) {
        this.duration = duration;
        this.coverageType = coverageType;
    }

    // Check if warranty is expired
    public boolean isExpired(int durationUsed) {
        return durationUsed > duration;
    }

    // Getters and Setters
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getCoverageType() {
        return coverageType;
    }

    public void setCoverageType(String coverageType) {
        this.coverageType = coverageType;
    }
}
