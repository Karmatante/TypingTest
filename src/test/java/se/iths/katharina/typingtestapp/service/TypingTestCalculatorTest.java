package se.iths.katharina.typingtestapp.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TypingTestCalculatorTest {
    TypingTestCalculator typingTestCalculator = new TypingTestCalculator();

    @Test
    @DisplayName("Kontrollerar att countWords() returnerar korrekt antal ord")
    void countWordsWithNormalText() {
        int actualWordCount = typingTestCalculator.countWords("hej på dig");
        Assertions.assertEquals(3, actualWordCount);
    }

    @Test
    @DisplayName("Kontrollerar att countWords() returnerar korrekt antal ord trots för många mellanslag")
    void countWordsWithTooManySpaces() {
        int actualWordCount = typingTestCalculator.countWords("  Hej   på    dig   ");
        Assertions.assertEquals(3, actualWordCount);
    }

    @Test
    @DisplayName("Kontrollerar att countWords() returnerar 0 ord vid endast mellanslag")
    void countWordsWithOnlySpaces() {
        int actualWordCount = typingTestCalculator.countWords("     ");
        Assertions.assertEquals(0, actualWordCount);
    }

    @Test
    @DisplayName("Kontrollerar att countWords() returnerar 0 ord när strängen är tomt")
    void countWordsWhenBlank() {
        int actualWordCount = typingTestCalculator.countWords("");
        Assertions.assertEquals(0, actualWordCount);
    }

    @Test
    @DisplayName("kontrollerar att calculateWpm() räknar ut rätt skrivhastighet")
    void calculateCorrectWordsPerMinute() {
        long actualWpm = typingTestCalculator.calculateWpm(20, 30);
        Assertions.assertEquals(40, actualWpm);
    }

    @Test
    @DisplayName("calculateWpm() avrundar 37,5 WPM till 38")
    void calculateWpmRoundsHalfUp() {
        long actualWpm = typingTestCalculator.calculateWpm(10, 16);
        Assertions.assertEquals(38, actualWpm);
    }

    @Test
    @DisplayName("calculateWpm() avrundar 35,29 WPM nedåt till 35")
    void calculateWpmRoundsDown() {
        long actualWpm = typingTestCalculator.calculateWpm(10, 17);
        Assertions.assertEquals(35, actualWpm);
    }

    @Test
    void calculateWpmWithZeroWordsReturnsZero() {
        long actualWpm = typingTestCalculator.calculateWpm(0, 30);
        Assertions.assertEquals(0, actualWpm);
    }

    @Test
    void calculateWpmWithZeroSecondsThrowsException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> typingTestCalculator.calculateWpm(10, 0)
        );
    }

    @Test
    void calculateWpmWithNegativeSecondsThrowsException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> typingTestCalculator.calculateWpm(10, -3)
        );
    }

    @Test
    void calculateWpmWithNegativeWordCountThrowsException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> typingTestCalculator.calculateWpm(-5, 30)
        );
    }

    @Test
    void calculateLevenshteinDistanceWithIdenticalTextReturnsZero() {
        int actualLevenshteinDistance = typingTestCalculator.calculateLevenshteinDistance("katt", "katt");
        Assertions.assertEquals(0, actualLevenshteinDistance);
    }

    @Test
    void calculateLevenshteinDistanceWithNotIdenticalTextReturnsZero() {
        int actualLevenshteinDistance = typingTestCalculator.calculateLevenshteinDistance("katt", "hatt");
        Assertions.assertEquals(1, actualLevenshteinDistance);
    }

    @Test
    void calculateLevenshteinDistanceWithOneSubstitutionReturnsOne() {
        int actualLevenshteinDistance = typingTestCalculator.calculateLevenshteinDistance("katt", "hatt");
        Assertions.assertEquals(1, actualLevenshteinDistance);
    }

    @Test
    void calculateLevenshteinDistanceWithOneDeletionReturnsOne() {
        int actualLevenshteinDistance = typingTestCalculator.calculateLevenshteinDistance("kratt", "katt");
        Assertions.assertEquals(1, actualLevenshteinDistance);
    }

    @Test
    void calculateLevenshteinDistanceWithOneInsertionReturnsOne() {
        int actualLevenshteinDistance = typingTestCalculator.calculateLevenshteinDistance("katt", "kratt");
        Assertions.assertEquals(1, actualLevenshteinDistance);
    }

    @Test
    void calculateLevenshteinDistanceWithEmptyOriginalTextReturnsFour() {
        int actualLevenshteinDistance = typingTestCalculator.calculateLevenshteinDistance("", "katt");
        Assertions.assertEquals(4, actualLevenshteinDistance);
    }

    @Test
    void calculateLevenshteinDistanceWithEmptyUserTextReturnsFour() {
        int actualLevenshteinDistance = typingTestCalculator.calculateLevenshteinDistance("katt", "");
        Assertions.assertEquals(4, actualLevenshteinDistance);
    }

    @Test
    void calculateLevenshteinDistanceWithBothEmptyTextsReturnsZero() {
        int actualLevenshteinDistance = typingTestCalculator.calculateLevenshteinDistance("", "");
        Assertions.assertEquals(0, actualLevenshteinDistance);
    }

    @Test
    void calculateLevenshteinDistanceWithSubstitutionAndInsertionReturnsThree() {
        int actualLevenshteinDistance = typingTestCalculator.calculateLevenshteinDistance("katt", "hattar");
        Assertions.assertEquals(3, actualLevenshteinDistance);
    }


}
