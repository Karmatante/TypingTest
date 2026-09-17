package se.iths.katharina.typingtestapp;

import se.iths.katharina.typingtestapp.model.Ansi;
import se.iths.katharina.typingtestapp.model.TypingText;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static void main() {


        // Visar introduktion och texten som användaren ska skriva av.
        showIntroduction();

        // Här skapar du listan med dina TypingText-objekt.
        List<TypingText> texts = new ArrayList<>();

        texts.add(new TypingText(
                "En lugn morgon",
                "Lätt",
                """
                        Solen lyste in genom köksfönstret när Emma satte sig vid bordet. Hon åt en smörgås och drack ett glas juice medan katten låg på stolen bredvid. Utanför gick några människor förbi på väg till jobbet. Det var en lugn morgon, och Emma hade gott om tid innan hon behövde gå hemifrån.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Bussen som nästan missades",
                "Ganska lätt",
                """
                        När Leo såg på klockan insåg han att bussen skulle gå om fem minuter. Han tog snabbt på sig jackan, stoppade mobilen i fickan och sprang mot hållplatsen. Precis när han kom runt hörnet såg han bussen närma sig. Föraren väntade några sekunder extra, och Leo hann kliva på med andan i halsen.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Det gamla biblioteket",
                "Medel",
                """
                        Biblioteket längst ner på torget hade funnits där så länge någon kunde minnas. Mellan de höga bokhyllorna luktade det svagt av papper och trä, och varje steg ekade genom de tysta rummen. En eftermiddag upptäckte Nora en smal dörr bakom en hylla. På dörren satt en liten skylt med orden: Endast för personal.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Efter regnet",
                "Medel",
                """
                        Det regnade hela morgonen, men framåt eftermiddagen började molnen sakta spricka upp över staden. Människor lämnade sina paraplyer hemma och fyllde parkerna, medan barnen sprang mellan de blöta träden. När solen till slut kom fram glittrade vattnet på gatorna och luften kändes plötsligt varm och klar.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Stormen över staden",
                "Svår",
                """
                        Under eftermiddagen hade mörka moln samlats över staden, men ingen verkade särskilt orolig förrän vinden plötsligt ökade. Cyklar välte längs trottoarerna, lösa reklamskyltar skramlade mot marken och människor skyndade mot närmaste entré. När regnet till slut föll kom det så kraftigt att husen på andra sidan gatan nästan försvann bakom ett grått draperi av vatten.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Observatoriet på berget",
                "Mycket svår",
                """
                        Klockan 22.47 öppnades taket på det lilla observatoriet högst uppe på berget. Temperaturen hade sjunkit till minus fyra grader, och den klara vinterluften gjorde stjärnhimlen ovanligt tydlig. Astronomen justerade teleskopets position med några millimeter och kontrollerade koordinaterna ännu en gång. Någonstans mellan Cassiopeia och Andromeda syntes ett svagt ljus som inte hade funnits på gårdagens fotografier; frågan var om det verkligen var något nytt.                        """.strip()
        ));

        // Sedan visar du menyn med titlarna.

        // Sedan läser du användarens val.

        // Sedan hämtar du rätt TypingText från listan.

        // Först därefter visar du själva skrivtexten
        // och startar tidtagningen.


        IO.println();

        String text1 = showReadingText();

        IO.println();

        IO.println("Börja skriva nu och tryck ENTER när du är klar.");

        IO.println();


        // Läser användarens text och mäter hur lång tid skrivandet tar.
        long startTime = System.nanoTime();

        String userInput = IO.readln();

        long endTime = System.nanoTime();

        long timeDiff = endTime - startTime;

        double inSeconds = timeDiff / 1000000000.0;


        // Beräknar resultaten från skrivtestet.
        int wordCount = countWords(userInput);

        double roundedTime = inSeconds * 100;

        roundedTime = Math.round(roundedTime);

        roundedTime = roundedTime / 100.0;

        long roundedWpm = calculateWpm(wordCount, inSeconds);

        int levenshteinDistance =
                calculateLevenshteinDistance(text1, userInput);

        int maxLength = Math.max(text1.length(), userInput.length());

        int correctChars = maxLength - levenshteinDistance;


        double roundedAccuracyPercentage =
                calculateAccuracy(correctChars, maxLength);

        // Visar det färdiga resultatet.
        showResults(
                roundedTime,
                wordCount,
                roundedWpm,
                correctChars,
                levenshteinDistance,
                roundedAccuracyPercentage);


    }

    private static void showIntroduction() {
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
    }

    private static String showReadingText() {
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
        return text1;
    }

    private static int countWords(String userInput) {
        int wordCount = 0;

        if (!userInput.isBlank()) {
            // \\s+ delar texten vid ett eller flera whitespace-tecken.
            String[] splittedText = userInput.trim().split("\\s+");
            wordCount = splittedText.length;
        }

        return wordCount;

    }

    private static long calculateWpm(int wordCount, double inSeconds) {
        // Omvandlar tiden till minuter för att kunna räkna ord per minut.
        double timeInMinutes = inSeconds / 60;

        double wpm = wordCount / timeInMinutes;
        return Math.round(wpm);

    }

    private static int calculateLevenshteinDistance(String text1, String userInput) {

        int substitutionCost;
        int deletionCost;
        int insertionCost;

        // Skapar Levenshtein-tabellen.
        // +1 behövs för den tomma texten i första raden och första kolumnen.
        int[][] distance = new int[text1.length() + 1][userInput.length() + 1];

        // Fyller första kolumnen med kostnaden för att ta bort tecken.
        for (int i = 0; i <= text1.length(); i++) {
            distance[i][0] = i;
        }

        // Fyller första raden med kostnaden för att lägga till tecken.
        for (int j = 0; j <= userInput.length(); j++) {
            distance[0][j] = j;
        }

        // Jämför tecknen och fyller resten av tabellen.
        for (int n = 1; n <= text1.length(); n++) {

            for (int m = 1; m <= userInput.length(); m++) {

                // Samma tecken kostar 0, olika tecken kostar 1 att ersätta.
                if (text1.charAt(n - 1) == userInput.charAt(m - 1)) {
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
        return distance[text1.length()][userInput.length()];
    }

    private static double calculateAccuracy(int correctChars, int maxLength) {

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

    private static void showResults(
            double roundedTime,
            int wordCount,
            long roundedWpm,
            int correctChars,
            int levenshteinDistance,
            double roundedAccuracyPercentage) {
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


        // Visar antal korrekta tecken och antal fel.
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

