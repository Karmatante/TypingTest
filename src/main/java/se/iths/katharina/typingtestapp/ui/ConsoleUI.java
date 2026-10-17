package se.iths.katharina.typingtestapp.ui;

import se.iths.katharina.typingtestapp.model.TypingTestResult;

public class ConsoleUI {

    public void showReadingText(String originalText) {
        IO.println(originalText);
    }

    public void showIntroduction() {
        IO.println("""
                ┌────────────────────────────────────────────────────────────────────────────┐
                │                                TYPING TEST                                 │
                ├────────────────────────────────────────────────────────────────────────────┤
                │ Du kommer att få se en kort text som du ska skriva av så noggrant och      │
                │ så snabbt du kan.                                                          │
                │                                                                            │
                │ När du är redo börjar testet, och tiden mäts tills du har skrivit klart    │
                │ texten och trycker Enter.                                                  │
                │                                                                            │
                │ Efter testet får du se hur lång tid det tog, din skrivhastighet och        │
                │ din noggrannhet.                                                           │
                └────────────────────────────────────────────────────────────────────────────┘
                """);
    }

    public void showResults(
            TypingTestResult typingTestResult) {
        IO.println();

        String timeText = "Tid: " + typingTestResult.getRoundedTime() + " sekunder";
        String wordText = "Antal ord: " + typingTestResult.getWordCount();
        String speedText = "Ord per minut: " + typingTestResult.getRoundedWpm();

        IO.println();
        IO.println("               ╔════════════════════════════════╗");
        IO.println("               ║            RESULTAT            ║");
        IO.println("               ╠════════════════════════════════╣");
        IO.println("               ║ " + String.format("%-30s", timeText) + " ║");
        IO.println("               ║ " + String.format("%-30s", wordText) + " ║");
        IO.println("               ║ " + String.format("%-30s", speedText) + " ║");
        IO.println("               ╚════════════════════════════════╝");


        // Visar antal korrekta tecken och antal fel.
        String correctText =
                "Korrekta tecken: " + typingTestResult.getCorrectChars();

        String errorText =
                "Totalt antal fel: " + typingTestResult.getLevenshteinDistance();

        IO.println();
        IO.println(
                "╔"
                        + "═".repeat(correctText.length() + 2)
                        + "╗"
                        + "    "
                        + "╔"
                        + "═".repeat(errorText.length() + 2)
                        + "╗"
        );

        IO.println(
                "║ "
                        + correctText
                        + " ║"
                        + "    "
                        + "║ "
                        + errorText
                        + " ║"
        );

        IO.println(
                "╚"
                        + "═".repeat(correctText.length() + 2)
                        + "╝"
                        + "    "
                        + "╚"
                        + "═".repeat(errorText.length() + 2)
                        + "╝"
        );

        // Visar den beräknade noggrannheten.
        String accuracyText =
                "Noggrannhet: "
                        + typingTestResult.getRoundedAccuracyPercentage()
                        + " %";

        IO.println();

        IO.println(
                "               ╔"
                        + "═".repeat(accuracyText.length() + 2)
                        + "╗"
        );

        IO.println(
                "               ║ "
                        + accuracyText
                        + " ║"
        );

        IO.println(
                "               ╚"
                        + "═".repeat(accuracyText.length() + 2)
                        + "╝"
        );
    }

    public void showStartInstruction() {
        IO.println();
        IO.println("Börja skriva nu och tryck ENTER när du är klar.");
        IO.println();
    }

    public String writingInput() {
        String userInput = IO.readln();
        return userInput;
    }

    public void showDifficultyMenu() {
        IO.println("Välj svårighetsgrad:");
        IO.println("1. Lätt");
        IO.println("2. Ganska lätt");
        IO.println("3. Medel");
        IO.println("4. Svår");
        IO.println("5. Mycket svår");
        IO.println();
    }

    public int readDifficultyChoice() {
        int difficultyChoice = 0;
        while (difficultyChoice < 1 || difficultyChoice > 5) {
            try {
                String userInput = IO.readln("Vilken svårighetsgrad väljer du?");
                difficultyChoice = Integer.parseInt(userInput);
            } catch (NumberFormatException e) {
                IO.println("Hoppsan! Det blev fel. Försök igen.");
            }
        }
        return difficultyChoice;
    }


    public void showErrorMessage() {
        IO.println("Det finns ingen text för den valda svårighetsgraden.");
    }

}