package se.iths.katharina.typingtestapp.data;

import se.iths.katharina.typingtestapp.model.TypingText;

import java.util.ArrayList;
import java.util.List;

public class TypingTextCatalog {

    public List<TypingText> getTexts() {
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

        texts.add(new TypingText(
                "Promenaden vid sjön",
                "Lätt",
                """
                        Maja gick ner till sjön efter lunch. Solen sken och vattnet låg nästan helt stilla. Några ankor simmade nära stranden och en hund sprang efter en pinne. Maja satte sig på en bänk och lyssnade på fåglarna en stund. Sedan gick hon långsamt hem igen.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Cykeln i regnet",
                "Ganska lätt",
                """
                        På väg hem från skolan började det plötsligt regna. Amir hade glömt sitt paraply och bestämde sig för att cykla så snabbt han kunde. Vägen blev hal, så han saktade ner i kurvorna och höll hårt i styret. När han kom hem var jackan genomblöt, men han skrattade åt hur tokigt allt hade blivit.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Tåget genom natten",
                "Svår",
                """
                        Tåget lämnade stationen strax efter midnatt och rullade långsamt ut ur den upplysta staden. Utanför fönstret försvann husen och ersattes av mörka skogar, små samhällen och fält som knappt gick att urskilja. Några passagerare sov redan, medan andra satt tysta med hörlurar eller böcker. När tåget ökade farten började ett svagt skramlande ljud höras från vagnen, men ingen verkade särskilt bekymrad.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Expeditionen i norr",
                "Mycket svår",
                """
                        Klockan 06.35 lämnade expeditionen den tillfälliga basen och började färden över det frusna landskapet. Temperaturen låg på minus sjutton grader, och vinden gjorde sikten sämre än väntat. Navigatören kontrollerade GPS-koordinaterna, jämförde dem med den handritade kartan och upptäckte en avvikelse på nästan två kilometer. Gruppen tvingades därför ändra riktning, trots att det innebar en längre och betydligt mer krävande väg genom terrängen.
                        """.strip()
        ));
        return texts;
    }
}
