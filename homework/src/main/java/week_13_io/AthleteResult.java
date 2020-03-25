package week_13_io;

class AthleteResult {

    private int number;
    private String name;
    private String countryCode;
    private String skiTimeResult;
    private String firstShootingRange;
    private String secondShootingRange;
    private String thirdShootingRange;

    AthleteResult(int number, String name, String countryCode, String skiTimeResult, String firstShootingRange, String secondShootingRange, String thirdShootingRange) {
        this.number = number;
        this.name = name;
        this.countryCode = countryCode;
        this.skiTimeResult = skiTimeResult;
        this.firstShootingRange = firstShootingRange;
        this.secondShootingRange = secondShootingRange;
        this.thirdShootingRange = thirdShootingRange;
    }

    String getName() {
        return name;
    }

    String getSkiTimeResult() {
        return skiTimeResult;
    }

    int getPenaltySeconds() {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (firstShootingRange.charAt(i) == 'o')
                count++;
            if (secondShootingRange.charAt(i) == 'o')
                count++;
            if (thirdShootingRange.charAt(i) == 'o')
                count++;
        }
        return count * 10;
    }

    /**
     * Returns the athlete's final time result in seconds, including penalties
     *
     * @return The athlete's final time result in seconds
     */
    int getFinalSecondsResult() {
        String[] splitTime = skiTimeResult.split(":");
        int minutes = Integer.parseInt(splitTime[0]);
        int seconds = Integer.parseInt(splitTime[1]);
        return minutes * 60 + seconds + getPenaltySeconds();
    }

    /**
     * Returns the athlete's final time result as a String of format "mm:ss"
     *
     * @return The athlete's final time result as a String
     */
    String getFinalTimeResult() {
        int totalSeconds = getFinalSecondsResult();
        int seconds = totalSeconds % 60;
        return totalSeconds / 60 + ":" + (seconds <= 9 ? "0" + seconds : Integer.toString(seconds));
    }
}
