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
                │ senare även din accuracy.                                                  │
                └────────────────────────────────────────────────────────────────────────────┘
                """ + Ansi.RESET);


        IO.println();
        IO.println(Ansi.BOLD + Ansi.PURPLE +
                "┌──────────────────────────── LÄSTEXT ─────────────────────────────────────┐"
                + Ansi.RESET);

        String text1 = "Det regnade hela morgonen, men framåt eftermiddagen började molnen sakta spricka upp över staden. Människor lämnade sina paraplyer hemma och fyllde parkerna, medan barnen sprang mellan de blöta träden. När solen till slut kom fram glittrade vattnet på gatorna och luften kändes plötsligt varm och klar.";

        IO.println();
        IO.println(Ansi.BOLD + "Det regnade hela morgonen, men framåt eftermiddagen började molnen sakta");
        IO.println("spricka upp över staden.");
        IO.println();
        IO.println("Människor lämnade sina paraplyer hemma och fyllde parkerna, medan barnen");
        IO.println("sprang mellan de blöta träden.");
        IO.println();
        IO.println("När solen till slut kom fram glittrade vattnet på gatorna och luften kändes");
        IO.println("plötsligt varm och klar." + Ansi.RESET);

        IO.println();
        IO.println(Ansi.PURPLE +
                "└──────────────────────────────────────────────────────────────────────────┘"
                + Ansi.RESET);
        IO.println();

        IO.println("Börja skriva nu och tryck ENTER när du är klar.");
        IO.println();
        long startTime = System.nanoTime();
        String userInput = IO.readln();
        long endTime = System.nanoTime();

        long timeDiff = endTime - startTime;

        double inSeconds = timeDiff / 1000000000.0;
        int wordCount;

        String[] splittedText = userInput.trim().split(" ");

        wordCount = splittedText.length;

        double timeInMinutes = inSeconds / 60;
        double wpm = wordCount / timeInMinutes;

        long roundedWpm = Math.round(wpm);


        double roundedTime = inSeconds * 100;
        roundedTime = Math.round(roundedTime);
        roundedTime = roundedTime / 100.0;

        double roundedMinutes = timeInMinutes * 100;
        roundedMinutes = Math.round(roundedMinutes);
        roundedMinutes = roundedMinutes / 100.0;

        int counterCorrectChars = 0;
        int counterIncorrectChars = 0;

        int comparisonLength = Math.min(text1.length(), userInput.length());

        for (int i = 0; i < comparisonLength; i++) {
            if (text1.charAt(i) == (userInput.charAt(i))) {
                counterCorrectChars++;

            } else {
                counterIncorrectChars++;
            }
        }

        int missingChars = 0;
        int extraChars = 0;

        if (userInput.length() < text1.length()) {
            missingChars = text1.length() - userInput.length();
        } else if (userInput.length() > text1.length()) {
            extraChars = userInput.length() - text1.length();
        }

        int totalIncorrectChars = counterIncorrectChars + missingChars + extraChars;


        double accuracyPercentage = (double) counterCorrectChars / (counterCorrectChars + totalIncorrectChars) * 100;

        double roundedAccuracyPercentage = accuracyPercentage * 100;
        roundedAccuracyPercentage = Math.round(roundedAccuracyPercentage);
        roundedAccuracyPercentage = roundedAccuracyPercentage / 100.0;


        IO.println();
        IO.println("RESULTAT");
        IO.println("Tid: " + roundedTime + " sekunder");
        IO.println("Antal ord: " + wordCount);
        IO.println("WPM: " + roundedWpm);
        IO.println("Korrekta tecken: " + counterCorrectChars);
        IO.println("Felaktiga tecken: " + counterIncorrectChars);
        IO.println("Saknade tecken: " + missingChars);
        IO.println("Extra tecken: " + extraChars);
        IO.println("Totalt antal fel: " + totalIncorrectChars);
        IO.println("Accuracy: " + roundedAccuracyPercentage + " %");

    }
}
