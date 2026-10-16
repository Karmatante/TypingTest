package se.iths.katharina.typingtestapp;

import se.iths.katharina.typingtestapp.data.TypingTextCatalog;
import se.iths.katharina.typingtestapp.model.TypingTestResult;
import se.iths.katharina.typingtestapp.model.TypingText;
import se.iths.katharina.typingtestapp.service.TypingTestCalculator;
import se.iths.katharina.typingtestapp.ui.ConsoleUI;

import java.util.List;

public class Main {

    static void main() {


        TypingTextCatalog typingTextCatalog = new TypingTextCatalog();
        TypingTestCalculator typingTestCalculator = new TypingTestCalculator();
        ConsoleUI consoleUI = new ConsoleUI();

        consoleUI.showIntroduction();
        consoleUI.showDifficultyMenu();
        int difficultyChoice = consoleUI.readDifficultyChoice();

        List<TypingText> texts = typingTextCatalog.getTexts();
        String originalText = texts.get(0).getText();

        consoleUI.showReadingText(originalText);
        consoleUI.showStartInstruction();

        long startTime = System.nanoTime();
        String userInput = consoleUI.writingInput();
        long endTime = System.nanoTime();

        long timeDiff = endTime - startTime;
        double inSeconds = timeDiff / 1000000000.0;

        TypingTestResult typingTestResult = typingTestCalculator.calculateResult(originalText, userInput, inSeconds);

        consoleUI.showResults(typingTestResult);


        String selectedDifficulty = selectDifficulty(difficultyChoice);
        
//HÄR FORTSÄTTER DU - behöver fångar NullPointerException i selectedText.getText()
        TypingText selectedText = null;
        for (TypingText typingText : texts) {
            if (selectedDifficulty.equals(typingText.getDifficulty())) {
                selectedText = typingText;
                break;
            }
        }
    }


    public static String selectDifficulty(int difficultyChoice) {
        return switch (difficultyChoice) {
            case 1 -> "Lätt";
            case 2 -> "Ganska lätt";
            case 3 -> "Medel";
            case 4 -> "Svår";
            case 5 -> "Mycket svår";
            default -> "Ogiltigt val";
        };

    }
}



