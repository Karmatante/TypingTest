package se.iths.katharina.typingtestapp.model;


public class TypingTestResult {
    private final double roundedTime;
    private final int wordCount;
    private final long roundedWpm;
    private final int correctChars;
    private final int levenshteinDistance;
    private final double roundedAccuracyPercentage;

    public TypingTestResult(double roundedTime, int wordCount, long roundedWpm, int correctChars, int levenshteinDistance, double roundedAccuracyPercentage) {
        this.roundedTime = roundedTime;
        this.wordCount = wordCount;
        this.roundedWpm = roundedWpm;
        this.correctChars = correctChars;
        this.levenshteinDistance = levenshteinDistance;
        this.roundedAccuracyPercentage = roundedAccuracyPercentage;
    }

    public double getRoundedTime() {
        return roundedTime;
    }

    public int getWordCount() {
        return wordCount;
    }

    public long getRoundedWpm() {
        return roundedWpm;
    }

    public int getCorrectChars() {
        return correctChars;
    }

    public int getLevenshteinDistance() {
        return levenshteinDistance;
    }

    public double getRoundedAccuracyPercentage() {
        return roundedAccuracyPercentage;
    }
}

