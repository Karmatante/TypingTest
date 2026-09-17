package se.iths.katharina.typingtestapp;

import se.iths.katharina.typingtestapp.model.Ansi;

public class Main {

    static void main() {

        IO.println(Ansi.BLUE + """
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
                """ + Ansi.RESET);


        IO.println();

        IO.println(
                Ansi.BOLD + Ansi.PURPLE
                        + "┌──────────────────────────── LÄSTEXT ─────────────────────────────────────┐"
                        + Ansi.RESET
        );


        String text1 = "Det regnade hela morgonen, men framåt eftermiddagen började molnen sakta spricka upp över staden. Människor lämnade sina paraplyer hemma och fyllde parkerna, medan barnen sprang mellan de blöta träden. När solen till slut kom fram glittrade vattnet på gatorna och luften kändes plötsligt varm och klar.";


        IO.println();

        IO.println(
                Ansi.BOLD
                        + "Det regnade hela morgonen, men framåt eftermiddagen började molnen sakta"
        );

        IO.println("spricka upp över staden.");

        IO.println();

        IO.println(
                "Människor lämnade sina paraplyer hemma och fyllde parkerna, medan barnen"
        );

        IO.println("sprang mellan de blöta träden.");

        IO.println();

        IO.println(
                "När solen till slut kom fram glittrade vattnet på gatorna och luften kändes"
        );

        IO.println(
                "plötsligt varm och klar."
                        + Ansi.RESET
        );


        IO.println();

        IO.println(
                Ansi.PURPLE
                        + "└──────────────────────────────────────────────────────────────────────────┘"
                        + Ansi.RESET
        );

        IO.println();


        IO.println("Börja skriva nu och tryck ENTER när du är klar.");

        IO.println();


        long startTime = System.nanoTime();

        String userInput = IO.readln();

        long endTime = System.nanoTime();


        long timeDiff = endTime - startTime;


        double inSeconds = timeDiff / 1000000000.0;


        String[] splittedText = userInput.trim().split(" ");

        int wordCount = splittedText.length;


        double timeInMinutes = inSeconds / 60;

        double wpm = wordCount / timeInMinutes;

        long roundedWpm = Math.round(wpm);


        double roundedTime = inSeconds * 100;

        roundedTime = Math.round(roundedTime);

        roundedTime = roundedTime / 100.0;


        int counterCorrectChars = 0;

        int counterIncorrectChars = 0;


        int comparisonLength =
                Math.min(text1.length(), userInput.length());


        for (int i = 0; i < comparisonLength; i++) {

            if (text1.charAt(i) == userInput.charAt(i)) {

                counterCorrectChars++;

            } else {

                counterIncorrectChars++;
            }
        }


        int missingChars = 0;

        int extraChars = 0;


        if (userInput.length() < text1.length()) {

            missingChars =
                    text1.length() - userInput.length();

        } else if (userInput.length() > text1.length()) {

            extraChars =
                    userInput.length() - text1.length();
        }


        int totalIncorrectChars =
                counterIncorrectChars
                        + missingChars
                        + extraChars;


        double accuracyPercentage =
                (double) counterCorrectChars
                        / (counterCorrectChars + totalIncorrectChars)
                        * 100;


        double roundedAccuracyPercentage =
                accuracyPercentage * 100;

        roundedAccuracyPercentage =
                Math.round(roundedAccuracyPercentage);

        roundedAccuracyPercentage =
                roundedAccuracyPercentage / 100.0;


        // RESULTAT

        IO.println();

        String timeText = "Tid: " + roundedTime + " sekunder";
        String wordText = "Antal ord: " + wordCount;
        String speedText = "Ord per minut: " + roundedWpm;

        IO.println();

        IO.println(Ansi.BOLD + Ansi.CYAN + "               ╔════════════════════════════════╗");
        IO.println("               ║            RESULTAT            ║");
        IO.println("               ╠════════════════════════════════╣");
        IO.println("               ║ " + String.format("%-30s", timeText) + " ║");
        IO.println("               ║ " + String.format("%-30s", wordText) + " ║");
        IO.println("               ║ " + String.format("%-30s", speedText) + " ║");
        IO.println("               ╚════════════════════════════════╝" + Ansi.RESET);


        // KORREKTA TECKEN OCH TOTALT ANTAL FEL

        String correctText =
                "Korrekta tecken: " + counterCorrectChars;

        String errorText =
                "Totalt antal fel: " + totalIncorrectChars;


        IO.println();

        IO.println(
                Ansi.GREEN
                        + "╔"
                        + "═".repeat(correctText.length() + 2)
                        + "╗"
                        + Ansi.RESET
                        + "    "
                        + Ansi.RED
                        + "╔"
                        + "═".repeat(errorText.length() + 2)
                        + "╗"
                        + Ansi.RESET
        );


        IO.println(
                Ansi.GREEN
                        + "║ "
                        + correctText
                        + " ║"
                        + Ansi.RESET
                        + "    "
                        + Ansi.RED
                        + "║ "
                        + errorText
                        + " ║"
                        + Ansi.RESET
        );


        IO.println(
                Ansi.GREEN
                        + "╚"
                        + "═".repeat(correctText.length() + 2)
                        + "╝"
                        + Ansi.RESET
                        + "    "
                        + Ansi.RED
                        + "╚"
                        + "═".repeat(errorText.length() + 2)
                        + "╝"
                        + Ansi.RESET
        );


        // NOGGRANNHET

        String accuracyText =
                "Noggrannhet: "
                        + roundedAccuracyPercentage
                        + " %";


        IO.println();

        IO.println(
                Ansi.BOLD + Ansi.PURPLE
                        + "               ╔"
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
                        + Ansi.RESET
        );
    }
}