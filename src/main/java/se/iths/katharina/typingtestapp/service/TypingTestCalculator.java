package se.iths.katharina.typingtestapp.service;

import se.iths.katharina.typingtestapp.model.TypingTestResult;

public class TypingTestCalculator {

    public int countWords(String userInput) {
        int wordCount = 0;

        if (!userInput.isBlank()) {
            // \\s+ delar texten vid ett eller flera whitespace-tecken.
            String[] splittedText = userInput.trim().split("\\s+");
            wordCount = splittedText.length;
        }

        return wordCount;

    }

    public long calculateWpm(int wordCount, double inSeconds) {
        if (inSeconds <= 0) {
            throw new IllegalArgumentException("Tiden får inte vara 0 eller lägre.");
        }

        if (wordCount < 0) {
            throw new IllegalArgumentException("Ordantal får inte vara negativt.");
        }

        // Omvandlar tiden till minuter för att kunna räkna ord per minut.
        double timeInMinutes = inSeconds / 60;

        double wpm = wordCount / timeInMinutes;
        return Math.round(wpm);
    }

    public int calculateLevenshteinDistance(String originalText, String userInput) {

        int substitutionCost;
        int deletionCost;
        int insertionCost;

        // Skapar Levenshtein-tabellen.
        // +1 behövs för den tomma texten i första raden och första kolumnen.
        int[][] distance = new int[originalText.length() + 1][userInput.length() + 1];

        // Fyller första kolumnen med kostnaden för att ta bort tecken.
        for (int i = 0; i <= originalText.length(); i++) {
            distance[i][0] = i;
        }

        // Fyller första raden med kostnaden för att lägga till tecken.
        for (int j = 0; j <= userInput.length(); j++) {
            distance[0][j] = j;
        }

        // Jämför tecknen och fyller resten av tabellen.
        for (int n = 1; n <= originalText.length(); n++) {

            for (int m = 1; m <= userInput.length(); m++) {

                // Samma tecken kostar 0, olika tecken kostar 1 att ersätta.
                if (originalText.charAt(n - 1) == userInput.charAt(m - 1)) {
                    substitutionCost = 0;
                } else {
                    substitutionCost = 1;
                }

                deletionCost = distance[n - 1][m] + 1;

                insertionCost = distance[n][m - 1] + 1;

                int substitution =
                        distance[n - 1][m - 1] + substitutionCost;

                // Sparar den billigaste av deletion, insertion och substitution.
                distance[n][m] =
                        Math.min(deletionCost, insertionCost);

                distance[n][m] =
                        Math.min(distance[n][m], substitution);
            }
        }
        // Sista rutan innehåller det minsta antalet ändringar mellan texterna.
        return distance[originalText.length()][userInput.length()];
    }

    public double calculateAccuracy(int correctChars, int maxLength) {

        // Räknar noggrannheten i procent.
        double accuracyPercentage =
                (double) correctChars
                        / maxLength
                        * 100;

        // Avrundar noggrannheten till två decimaler.
        double roundedAccuracyPercentage =
                accuracyPercentage * 100;

        roundedAccuracyPercentage =
                Math.round(roundedAccuracyPercentage);

        roundedAccuracyPercentage =
                roundedAccuracyPercentage / 100.0;

        return roundedAccuracyPercentage;
    }

    public TypingTestResult calculateResult(String originalText, String userInput, double inSeconds) {
        int wordCount = countWords(userInput);
        long roundedWpm = calculateWpm(wordCount, inSeconds);
        double roundedTime = inSeconds * 100;
        roundedTime = Math.round(roundedTime);
        roundedTime = roundedTime / 100.0;
        int levenshteinDistance = calculateLevenshteinDistance(originalText, userInput);
        int maxLength = Math.max(originalText.length(), userInput.length());
        int correctChars = maxLength - levenshteinDistance;
        double roundedAccuracyPercentage = calculateAccuracy(correctChars, maxLength);

        TypingTestResult typingTestResult = new TypingTestResult(roundedTime, wordCount, roundedWpm, correctChars, levenshteinDistance, roundedAccuracyPercentage);
        return typingTestResult;
    }
}
