package se.iths.katharina.typingtestapp;

import se.iths.katharina.typingtestapp.model.Ansi;

public class Main {

    static void main() {


        // Visar introduktion och instruktioner för skrivtestet.

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

        // Originaltexten som användarens text ska jämföras med.
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


        // Startar tidtagningen precis innan användaren börjar skriva.
        long startTime = System.nanoTime();

        String userInput = IO.readln();


        // Stoppar tidtagningen när användaren trycker Enter.
        long endTime = System.nanoTime();

        // Räknar ut hur lång tid användaren använde.
        long timeDiff = endTime - startTime;

        // Omvandlar nanosekunder till sekunder.
        double inSeconds = timeDiff / 1000000000.0;


        // Räknar antalet ord.
        // isBlank() gör att tom input eller bara mellanslag ger 0 ord.
        int wordCount = 0;

        if (userInput.isBlank()) {
        } else {
            // \\s+ delar texten vid ett eller flera whitespace-tecken.
            String[] splittedText = userInput.trim().split("\\s+");
            wordCount = splittedText.length;
        }

        // Omvandlar tiden till minuter för att kunna räkna ord per minut.
        double timeInMinutes = inSeconds / 60;

        double wpm = wordCount / timeInMinutes;

        long roundedWpm = Math.round(wpm);

        // Avrundar tiden till två decimaler.
        double roundedTime = inSeconds * 100;

        roundedTime = Math.round(roundedTime);

        roundedTime = roundedTime / 100.0;


        // --------------------------------------------------
        // LEVENSHTEIN DISTANCE
        // --------------------------------------------------

        // Kostnader för de tre möjliga ändringarna.

        int substitutionCost = 0;
        int deletionCost = 0;
        int insertionCost = 0;
        int levenshteinDistance;

        // Tvådimensionell array som används som tabell.
        // +1 behövs för den tomma texten i första raden och första kolumnen.
        int[][] distance = new int[text1.length() + 1][userInput.length() + 1];


        // Fyller första kolumnen: 0, 1, 2, 3 ...
        // Värdet motsvarar hur många tecken som måste tas bort
        // för att nå en tom text.
        for (int i = 0; i <= text1.length(); i++) {
            distance[i][0] = i;
        }

        // Fyller första raden: 0, 1, 2, 3 ...
        // Värdet motsvarar hur många tecken som måste läggas till.
        for (int j = 0; j <= userInput.length(); j++) {
            distance[0][j] = j;
        }
        // Går igenom resten av Levenshtein-tabellen.
        for (int n = 1; n <= text1.length(); n++) {
            for (int m = 1; m <= userInput.length(); m++) {
                // Om tecknen är lika behövs ingen substitution.
                // Om de är olika kostar en substitution 1.
                if (text1.charAt(n - 1) == userInput.charAt(m - 1)) {
                    substitutionCost = 0;
                } else {
                    substitutionCost = 1;
                }
                // Deletion använder värdet i rutan ovanför + 1.
                deletionCost = distance[n - 1][m] + 1;

                // Insertion använder värdet i rutan till vänster + 1.
                insertionCost = distance[n][m - 1] + 1;

                // Substitution använder den diagonala rutan
                // plus 0 eller 1 beroende på om tecknen är lika.
                int substitution = distance[n - 1][m - 1] + substitutionCost;

                // Väljer det billigaste av deletion och insertion.
                distance[n][m] = Math.min(deletionCost, insertionCost);

                // Jämför sedan det billigaste värdet med substitution.
                distance[n][m] = Math.min(distance[n][m], substitution);


            }
        }
        // Rutan längst ner till höger innehåller
        // det minsta antalet ändringar mellan texterna.
        levenshteinDistance = distance[text1.length()][userInput.length()];

        // Använder den längre textens längd som grund
        // för noggrannhetsberäkningen.
        int maxLength = Math.max(text1.length(), userInput.length());

        // Räknar hur många tecken som kan betraktas som korrekta.
        int correctChars = maxLength - levenshteinDistance;

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


        // --------------------------------------------------
        // RESULTAT
        // --------------------------------------------------

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


        // Visar antal korrekta tecken och antal ändringar/fel.
        String correctText =
                "Korrekta tecken: " + correctChars;

        String errorText =
                "Totalt antal fel: " + levenshteinDistance;


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


        // Visar den beräknade noggrannheten.
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