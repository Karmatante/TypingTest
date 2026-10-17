package se.iths.katharina.typingtestapp.data;

import org.yaml.snakeyaml.Yaml;
import se.iths.katharina.typingtestapp.model.TypingText;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class TypingTextCatalog {

    public List<TypingText> getTexts() {
        List<TypingText> texts = new ArrayList<>();

        texts.add(new TypingText(
                "Bollen på taket",
                "Lätt",
                """
                        Emil sparkade bollen lite för högt. Den flög över gräset och landade på det låga taket till boden. Han stod stilla en stund och tittade upp. Sedan gick han in för att be om hjälp. Hans mamma tog fram en lång borste och petade ner bollen. Emil tackade och gick till en annan del av gården.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Bullar hos farmor",
                "Lätt",
                """
                        Det doftade gott i köket när Signe kom hem till farmor. På bordet stod en plåt med varma bullar och två glas mjölk. Signe tog av sig jackan och satte sig på sin vanliga stol. Farmor frågade hur dagen hade varit. De pratade en lång stund medan bullarna svalnade och regnet föll mot rutorna.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Den blå draken",
                "Lätt",
                """
                        Det blåste lagom mycket när Milo tog med sin drake till ängen. Hans pappa höll i den medan Milo sprang över gräset. Snart steg draken högt över deras huvuden. Milo höll hårt i snöret och såg hur den rörde sig i vinden. När de gick hem var hans skor blöta, men han ville redan flyga med draken igen.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Den röda halsduken",
                "Lätt",
                """
                        Liv hittade en röd halsduk på bänken vid porten. Hon tog upp den och såg sig omkring. En bit bort gick en kvinna med en liten hund. Liv ropade och frågade om halsduken var hennes. Kvinnan vände sig om och log. Hon tackade Liv och tog på sig halsduken innan hon gick vidare med hunden.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Den sista kakan",
                "Lätt",
                """
                        På fatet låg bara en kaka kvar. Hedda såg på sin bror och sedan på kakan. Båda ville ha den, men ingen tog den. Till slut hämtade hon en kniv och delade kakan i två bitar. De fick varsin halva och satte sig vid bordet igen. Utanför fönstret hade det börjat snöa.
                        """.strip()
        ));

        texts.add(new TypingText(
                "En båt av papper",
                "Lätt",
                """
                        Arvid vek en liten båt av ett vitt papper. Sedan tog han på sig stövlarna och gick ut på gården. Efter regnet hade en stor pöl bildats nära grinden. Han satte båten på vattnet och gav den en lätt knuff. Den flöt hela vägen till andra kanten, där hans syster stod redo att ta emot den.
                        """.strip()
        ));

        texts.add(new TypingText(
                "En katt i solen",
                "Lätt",
                """
                        Katten låg på mattan där solen lyste in genom fönstret. Den sträckte på benen och lade sedan huvudet mot golvet igen. Elsa satt i soffan och läste en bok. Ibland såg hon upp för att titta på katten. När hon reste sig för att hämta vatten följde katten efter och väntade vid sin skål.
                        """.strip()
        ));

        texts.add(new TypingText(
                "En lugn morgon",
                "Lätt",
                """
                        Solen lyste in genom köksfönstret när Emma satte sig vid bordet. Hon åt en smörgås och drack ett glas juice medan katten låg på stolen bredvid. Utanför gick några människor förbi på väg till jobbet. Det var en lugn morgon, och Emma hade gott om tid innan hon behövde gå hemifrån.
                        """.strip()
        ));

        texts.add(new TypingText(
                "En ny bok",
                "Lätt",
                """
                        Iris gick till biblioteket efter skolan. Hon letade efter en bok om djur och hittade en med en räv på framsidan. Sedan satte hon sig vid ett litet bord och började läsa. Bilderna var stora och fina. Innan hon gick hem lånade hon boken så att hon kunde visa den för sin lillebror på kvällen.
                        """.strip()
        ));

        texts.add(new TypingText(
                "En promenad i parken",
                "Lätt",
                """
                        Oskar tog på sig skorna och gick ut en stund. I parken låg gula löv på marken. Han följde vägen förbi dammen och satte sig på en bänk. Där såg han två ankor som simmade nära kanten. Efter en stund började det blåsa. Oskar drog upp sin jacka och gick hem för att dricka varmt te.
                        """.strip()
        ));

        texts.add(new TypingText(
                "En stund i trädgården",
                "Lätt",
                """
                        Vera tog med sig en kanna vatten ut i trädgården. Hon började med blommorna vid grinden och fortsatte sedan till det lilla äppelträdet. På gräset låg en röd boll som hennes lillebror hade glömt. Hon lade den på trappan och satte sig på bänken. En fågel landade på staketet och satt kvar en liten stund.
                        """.strip()
        ));

        texts.add(new TypingText(
                "En tur till affären",
                "Lätt",
                """
                        Adam behövde köpa mjölk och bröd innan affären stängde. Han tog sin påse och gick den korta vägen genom parken. Vid dammen stannade han en stund för att titta på några fåglar. Sedan fortsatte han till affären och hittade allt han behövde. På vägen hem mötte han en vän som följde med honom en bit.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Frukost på balkongen",
                "Lätt",
                """
                        Sara bar ut sin frukost till det lilla bordet på balkongen. På tallriken låg två smörgåsar med ost och ett äpple. Hon satte sig på en stol och såg ut över gården. En hund sprang runt på gräset medan dess ägare väntade vid grinden. Sara tog en klunk te och njöt av den varma solen.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Färger på ett papper",
                "Lätt",
                """
                        Otto tog fram sina pennor och lade ett stort papper på bordet. Först ritade han ett hus med en gul dörr. Sedan gjorde han en sol och några träd. Hans vän ritade en hund på gräset bredvid huset. När bilden var klar skrev de sina namn längst ner och satte upp den på väggen i köket.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Hunden vid grinden",
                "Lätt",
                """
                        En liten hund stod vid grinden och viftade på svansen. Axel stannade en bit bort och såg sig omkring. Snart kom en man ut ur huset med ett koppel i handen. Han öppnade grinden och hälsade på Axel. Hunden fick sitt koppel och följde glatt med mannen ut på vägen för en promenad.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Kvällen vid sjön",
                "Lätt",
                """
                        Vattnet låg stilla när Lina kom ner till sjön. Hon satte sig på bryggan och lät fötterna vila strax ovanför ytan. På andra sidan hördes några barn som lekte vid stranden. En liten båt gled sakta förbi en bit bort. Lina tog fram en bok ur väskan och började läsa medan solen sjönk bakom träden.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Lampan vid sängen",
                "Lätt",
                """
                        Elias fick en ny lampa att ha vid sängen. Han ställde den på det lilla bordet och tände den. Ljuset föll rakt på boken som låg på kudden. På kvällen kröp han ner under täcket och läste några sidor. När han blev trött lade han ett kort mellan bladen och släckte lampan innan han somnade.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Morgonen på landet",
                "Lätt",
                """
                        Agnes vaknade tidigt av att en fågel sjöng utanför fönstret. Hon drog undan gardinen och såg ut över den gröna hagen. Två hästar stod nära staketet och åt gräs. Nere i köket hördes någon som satte fram koppar på bordet. Agnes tog på sig sina tofflor och gick ner för att äta frukost med de andra.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Mössan på kroken",
                "Lätt",
                """
                        Rut letade efter sin mössa när hon skulle gå ut. Hon tittade i väskan och under stolen i hallen. Mössan fanns inte där. Då såg hennes syster något grönt bakom en jacka. Där hängde mössan på en krok. Rut tog på sig den och öppnade dörren. Nu var hon redo att gå ut i kylan.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Pannkakor till lunch",
                "Lätt",
                """
                        Nils stod vid spisen och stekte pannkakor till lunch. Hans syster dukade bordet och tog fram sylt och mjölk. Den första pannkakan gick sönder, men de andra blev fina. När allt var klart satte de sig vid bordet. De åt långsamt och pratade om dagen. Efter maten hjälptes de åt att diska och torka av bordet.
                        """.strip()
        ));

        texts.add(new TypingText(
                "På väg till skolan",
                "Lätt",
                """
                        Hugo gick hemifrån med väskan på ryggen och en mössa på huvudet. Luften var kall, men solen hade börjat värma. Vid nästa gata mötte han sin vän Ella. De gick tillsammans den sista biten och pratade om vad de skulle göra efter skolan. När de kom fram stod dörren öppen och deras lärare väntade i hallen.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Snäckor på stranden",
                "Lätt",
                """
                        Alma gick längs stranden med en liten hink i handen. Hon letade efter snäckor som havet hade lämnat på sanden. Några var vita och andra hade bruna ränder. Vid en sten hittade hon en som var större än de andra. Hon lade den överst i hinken och gick tillbaka till filten för att visa sin pappa.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Besöket på bondgården",
                "Ganska lätt",
                """
                        Klassen skulle besöka en bondgård och alla hade fått ta med sig stövlar. Först fick de se korna och hjälpa till att lägga hö hos fåren. Sedan visade bonden var hönsen värpte sina ägg. Alicia fick försiktigt hålla ett nyvärpt ägg i handen. Det var fortfarande varmt när hon lade det i korgen som läraren bar.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Biljetterna till filmen",
                "Ganska lätt",
                """
                        Noel hade lovat att köpa biljetter till kvällens film. När han öppnade bokningen fanns det bara några få platser kvar. Han valde två stolar längst bak och skickade en bild till sin kompis. Först då såg han att han hade valt fel dag. Som tur var kunde han byta biljetterna och ändå få två platser bredvid varandra.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Blommor till balkongen",
                "Ganska lätt",
                """
                        Juni ville göra balkongen fin inför sommaren och köpte några krukor med blommor. Hon bar hem dem i två stora påsar och ställde dem längs räcket. När hon var klar upptäckte hon att vattenkannan saknades. Den hade hon lånat ut till grannen veckan innan. Hon knackade på för att hämta den och fick några extra frön med sig hem.
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
                "Cykeln med det tomma däcket",
                "Ganska lätt",
                """
                        Alva skulle cykla till sin kusin när hon upptäckte att bakdäcket var tomt. Hon hämtade pumpen i förrådet och försökte fylla det med luft. Efter en stund blev däcket hårt igen, men snart hördes ett svagt pysande ljud. Alva suckade och ställde tillbaka cykeln. Hon skickade ett meddelande till kusinen och gick sedan till busshållplatsen på andra sidan gatan.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Den borttappade handsken",
                "Ganska lätt",
                """
                        På väg hem märkte Ludvig att han bara hade en handske kvar. Han mindes att han hade tagit av sig båda för att svara i telefon. Därför gick han tillbaka till bänken där han hade suttit. Handsken låg inte på marken, men någon hade lagt den på ryggstödet. Han drog på sig den och fortsatte hem med varma händer.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Den glömda matlådan",
                "Ganska lätt",
                """
                        När Filip skulle äta lunch märkte han att matlådan saknades. Han hade ställt den på köksbordet för att inte glömma den, men ändå gått hemifrån utan den. Som tur var hade kaféet bredvid jobbet öppet. Han köpte en varm smörgås och satte sig vid fönstret. Nästa morgon lade han sina nycklar ovanpå matlådan innan han tog på sig skorna.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Ett oväntat stopp",
                "Ganska lätt",
                """
                        Bussen stannade mitt på vägen strax före bron. Föraren berättade att några får hade tagit sig ut ur en hage längre fram. Passagerarna lutade sig mot fönstren för att se bättre. Efter en stund kom en bonde springande med en hink. Fåren följde honom tillbaka genom grinden, och bussen kunde fortsätta sin resa några minuter senare.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Fel väska på träningen",
                "Ganska lätt",
                """
                        När Ebba kom hem från träningen upptäckte hon att hon hade fått med sig fel väska. Den såg precis ut som hennes, men inuti låg ett par alldeles för stora skor. Hon skrev till laget och fick snart svar från en lagkamrat. De bestämde sig för att mötas vid idrottshallen. Innan nästa träning satte Ebba ett grönt band på sitt handtag.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Födelsedagstårtan",
                "Ganska lätt",
                """
                        William ville överraska sin syster med en tårta på hennes födelsedag. Han läste receptet noga och ställde fram allt på köksbänken. Det gick bra tills han skulle vispa grädden och råkade välja högsta farten direkt. Små vita prickar hamnade över hela bordet. När systern kom hem var köket rent igen och tårtan stod färdig med jordgubbar på toppen.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Hyllan som hamnade snett",
                "Ganska lätt",
                """
                        Freja ville sätta upp en hylla ovanför sitt skrivbord. Hon mätte väggen noga och bad sin bror hålla hyllan medan hon markerade hålen. När allt satt på plats lade hon dit sin första bok. Den gled långsamt åt sidan. De såg på varandra och började skratta. Nästa gång använde de ett vattenpass innan de gjorde nya hål.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Kassens trasiga handtag",
                "Ganska lätt",
                """
                        Precis utanför affären gick handtaget på Majkens kasse sönder. En apelsin rullade över marken och stannade vid en cykel. Hon böjde sig ner för att samla ihop sina varor. En man som kom förbi höll fram en extra tygpåse. Majken tackade och packade om allting. Den nya påsen var lättare att bära hela vägen hem.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Middagen som fick vänta",
                "Ganska lätt",
                """
                        Tove hade precis börjat laga middag när det ringde på dörren. Utanför stod hennes granne med en tung kartong som skulle upp till vinden. Tove stängde av spisen och följde med för att hjälpa till. Kartongen var större än de hade trott, men tillsammans fick de upp den. När hon kom tillbaka till köket hade hon blivit ännu hungrigare.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Nyckeln i jackfickan",
                "Ganska lätt",
                """
                        När Maja kom hem upptäckte hon att nyckeln inte låg i väskan. Hon letade bland böcker, kvitton och gamla bussbiljetter utan att hitta den. Sedan kom hon ihåg att hon hade bytt jacka på morgonen. Hon ringde sin bror, som fortfarande var hemma. Några minuter senare öppnade han dörren och räckte henne jackan med nyckeln kvar i fickan.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Paketet hos grannen",
                "Ganska lätt",
                """
                        Oliver hade väntat på sitt paket i flera dagar. När mobilen till slut visade att det hade kommit sprang han ner till porten. Där fanns inget paket, men på dörren satt en lapp från grannen. Hon hade tagit hand om det medan han var borta. Oliver knackade på hos henne och fick både sitt paket och en nybakad bulle.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Pusslet på köksbordet",
                "Ganska lätt",
                """
                        Sixten hade nästan lagt klart sitt pussel när han upptäckte att en bit saknades. Han letade under bordet och mellan stolarna utan att hitta den. Nästa morgon skulle hans syster hämta sin tröja från soffan. Då föll den sista biten ner på golvet. Sixten satte den på plats och tog en bild av det färdiga pusslet.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Regn under marknaden",
                "Ganska lätt",
                """
                        Torget var fullt av människor när Anton kom till marknaden. Han köpte en påse äpplen och stannade sedan vid ett bord med gamla böcker. Just då började regnet falla. Försäljaren drog snabbt ett skydd över bordet och bad Anton hjälpa till med lådorna. När allt stod torrt under tältet fick han välja en bok som tack för hjälpen.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Skorna utanför dörren",
                "Ganska lätt",
                """
                        Efter besöket hos sin vän tog Malte på sig skorna och gick mot bussen. Redan efter några steg kände han att något var fel. Skorna klämde vid tårna och var mycket tyngre än vanligt. Han tittade ner och såg att han hade tagit vännens skor. Med ett skratt vände han tillbaka och ringde på dörren igen.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Sången vid busshållplatsen",
                "Ganska lätt",
                """
                        Medan Leona väntade på bussen hörde hon någon spela gitarr på andra sidan gatan. Hon kände igen sången och började sjunga tyst för sig själv. En äldre kvinna bredvid henne log och gjorde likadant. När bussen kom hade de hunnit prata en stund. De satte sig bredvid varandra och fortsatte prata tills Leona skulle kliva av.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Tvätten före regnet",
                "Ganska lätt",
                """
                        Molly hade hängt ut tvätten på gården när himlen plötsligt blev mörk. Hon tog sin tomma korg och skyndade ut för att hämta in allt. De första dropparna kom precis när hon lossade det sista lakanet. Hennes granne höll upp dörren medan hon bar in korgen. Snart hängde kläderna på tork i badrummet i stället.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Utflykten till stranden",
                "Ganska lätt",
                """
                        Familjen hade planerat en utflykt till stranden hela veckan. På lördagsmorgonen packade de badkläder, handdukar och en stor korg med mat. När de kom fram blåste det mer än de hade väntat sig. De hittade en plats bakom några klippor där vinden inte nådde fram. Där bredde de ut sin filt och åt lunch innan någon vågade prova vattnet.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Överraskningen i frysen",
                "Ganska lätt",
                """
                        Sam skulle baka bröd och behövde göra plats i frysen. Längst in bakom en påse ärtor hittade han en burk med glass. Han trodde att den hade tagit slut under sommaren. På locket satt en lapp med hans systers namn. Han frågade om hon ville dela, och snart satt de vid köksbordet med varsin skål.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Bageriets nattliga arbete",
                "Medel",
                """
                        När resten av gatan sov tände bagaren ljuset och vägde upp mjöl i en stor bunke. Degen hade vilat sedan kvällen och var nu mjuk och full av små luftbubblor. Han delade den i jämna bitar medan radion spelade lågt. Flera timmar senare stannade dagens första kund utanför dörren och kände doften av brödet som just hade lämnat ugnen.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Bokhandeln vid stationen",
                "Medel",
                """
                        Medan hon väntade på sitt tåg gick Ingrid in i bokhandeln vid stationen. Där inne var det varmt, och från en radio bakom disken hördes låg musik. Hon drog ut en tunn bok ur hyllan och upptäckte en tågbiljett mellan sidorna. Biljetten var över trettio år gammal och gällde samma sträcka som hon själv skulle resa den eftermiddagen.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Brevet på vinden",
                "Medel",
                """
                        Under en låda med julpynt hittade Sofia ett gulnat kuvert utan frimärke. Hennes namn stod på framsidan, skrivet med en handstil hon inte kände igen. Inuti låg ett kort brev och ett fotografi av huset där hon bodde. Bilden var tagen långt innan hon föddes, men vid grinden stod någon som såg märkligt bekant ut.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Butiken på hörnet",
                "Medel",
                """
                        Den lilla butiken på hörnet sålde sådant som sällan fanns någon annanstans. I skyltfönstret trängdes gamla fickur, handmålade koppar och kartor över platser som Elin aldrig hade hört talas om. En dag lade hon märke till en anteckningsbok med ett lås av mässing. När hon frågade efter priset log ägaren och undrade varför just den hade fångat hennes intresse.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Den första snön",
                "Medel",
                """
                        Under natten hade snön lagt sig över hustaken och gjort gården nästan oigenkännlig. Cyklarna vid staketet hade fått vita sadlar, och gångvägen syntes bara som en svag fördjupning. Felicia stod vid fönstret och såg fastighetsskötaren dra fram sin snöskyffel. Snart skulle gården fyllas av fotspår, men ännu låg snön orörd mellan träden och den tomma sandlådan.
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
                "Fiolen bakom skåpet",
                "Medel",
                """
                        När musikskolan skulle flytta behövde alla rum tömmas före helgen. Bakom ett tungt skåp hittade Leon ett smalt fodral täckt av damm. Inuti låg en fiol med en trasig sträng och en liten etikett på insidan. Läraren kände genast igen namnet som stod där. Det tillhörde skolans första rektor, som tydligen hade varit en skicklig musiker.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Fotografiet i ramen",
                "Medel",
                """
                        När Samuel skulle byta fotografi i den gamla ramen gled ett vikt papper ut från baksidan. På pappret fanns en enkel karta över kvarteret där hans mormor hade vuxit upp. Ett av husen var markerat med en blå cirkel. Han visade kartan för henne samma kväll, och hon började genast berätta om en sommar som hon aldrig tidigare hade nämnt.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Fönstret mot gården",
                "Medel",
                """
                        Från sitt nya arbetsrum kunde Lova se rakt in på en liten innergård. Där fanns ett päronträd, några slitna stolar och ett bord som nästan doldes av löv. Under de första veckorna såg hon aldrig någon där. En söndag hördes plötsligt röster genom det öppna fönstret. Grannarna hade samlats för att städa gården och bjöd ner henne på kaffe.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Huset på andra sidan sjön",
                "Medel",
                """
                        Från stugan kunde Benjamin se ett ensamt hus på andra sidan sjön. Under hela sommaren hade fönstren varit mörka och bryggan legat tom. Men en kväll syntes en lampa på övervåningen och en liten roddbåt nere vid stranden. Han frågade sin morfar vem som bodde där. Morfadern såg länge ut över vattnet innan han svarade att huset skulle vara obebott.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Kaféet före öppning",
                "Medel",
                """
                        Innan dagens första gäster kom brukade Mira sitta ensam vid kaféets största fönster. Hon kontrollerade beställningarna och lyssnade på kaffemaskinens låga surrande. Den här morgonen låg ett vykort på hennes vanliga plats. På framsidan syntes kaféet som det hade sett ut för länge sedan. På baksidan stod en hälsning från kvinnan som en gång hade öppnat det.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Kartan i skolboken",
                "Medel",
                """
                        När Vincent öppnade den begagnade geografiboken föll en handritad karta ner på bänken. Någon hade markerat en stig genom skogen bakom skolan och ritat ett kryss vid en stor sten. Under kartan stod ett namn och ett gammalt datum. På rasten visade han fyndet för sin lärare, som log och berättade om en skattjakt hon ordnat många år tidigare.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Keramikkursens första kväll",
                "Medel",
                """
                        Drejskivan snurrade snabbare än Elvira hade väntat sig, och lerklumpen började luta åt sidan. Kursledaren visade hur hon kunde hålla händerna stadigt och försiktigt föra leran mot mitten. Efter några försök reste sig en låg skål mellan hennes fingrar. Kanten var ojämn, men när kvällen var slut ställde hon den på torkhyllan med sitt namn skrivet på en liten lapp.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Ljudet från klockstapeln",
                "Medel",
                """
                        Under promenaden genom byn hörde Yusuf plötsligt kyrkklockorna ringa mitt på eftermiddagen. Utanför kyrkan stod en stege lutad mot klockstapeln, och två personer bar fram verktyg ur en bil. Han stannade för att lyssna och fick veta att klockorna hade varit tysta i nästan ett år. Nu provades den lagade mekanismen för första gången inför helgens gudstjänst.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Ljuset vid fyren",
                "Medel",
                """
                        Från hamnen syntes fyren som en mörk skugga mot kvällshimlen. Dess vanliga ljus hade varit släckt sedan en ny anläggning byggts längre ut på kusten. Därför stannade Isak mitt i steget när ett varmt sken plötsligt fyllde det översta fönstret. Nästa morgon tog han stigen dit och mötte en målare som hade fått låna tornet som ateljé.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Namnet på parkbänken",
                "Medel",
                """
                        På bänken under kastanjeträdet satt en liten metallskylt med ett namn och två årtal. Astrid hade gått förbi den många gånger utan att fundera närmare på vem personen var. En dag slog sig en äldre man ner bredvid henne. Han berättade att kvinnan på skylten hade skött parkens planteringar och att kastanjeträdet hade varit hennes alldeles särskilda favorit.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Natten i tältet",
                "Medel",
                """
                        Det hade varit varmt hela dagen, men när mörkret föll blev luften snabbt kyligare. Amina drog sovsäcken närmare hakan och lyssnade på skogens ljud utanför tältet. Något prasslade bland löven alldeles intill hennes ryggsäck. Hon tände ficklampan och öppnade försiktigt tältduken. I ljuskäglan stod en igelkott som verkade betydligt mer intresserad av hennes matsäck än av henne.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Repetitionen",
                "Medel",
                """
                        Det var första gången kören skulle öva i den stora kyrkan. När alla hade hittat sina platser bad dirigenten dem att sjunga den första tonen tillsammans. Ljudet steg mot taket och dröjde kvar långt efter att de hade tystnat. Klara, som vanligtvis sjöng ganska försiktigt, blev så förvånad av klangen att hon nästan glömde att följa dirigentens nästa tecken.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Torgets nya fontän",
                "Medel",
                """
                        Under flera veckor hade torgets mitt varit dold bakom ett högt byggstaket. Nu var staketet borta, och där innanför stod en fontän av mörk sten. Vattnet rann över kanten och samlades i en grund bassäng. Selma satte sig på en bänk och såg människor stanna till. Redan första dagen verkade platsen ha blivit en naturlig mötespunkt.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Trädgårdens första skörd",
                "Medel",
                """
                        Under våren hade Fatima nästan gett upp hoppet om sin lilla odling. Jorden var torr och flera av fröna hade aldrig grott. Men efter några veckor med regn började det växa ordentligt. Nu kunde hon plocka sallad och dra upp de första morötterna. De var mindre än dem i affären, men hon bar in dem i köket med stor försiktighet.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Tåget genom skogen",
                "Medel",
                """
                        Tåget lämnade stationen strax efter lunch och fortsatte norrut genom ett landskap av skog och små sjöar. Vid fönstret satt Amir med en bok i knät, men utsikten gjorde det svårt att läsa. Mellan träden skymtade övergivna hus och smala grusvägar. När tåget plötsligt saktade in fick han syn på en älg som stod alldeles intill spåret.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Utställningen i kvarnen",
                "Medel",
                """
                        Den gamla kvarnen hade stått tom i flera år innan byns konstförening fick låna den. Nu hängde målningar längs väggarna, och på golvet stod skulpturer mellan de tunga trästolparna. Melvin gick långsamt genom rummet och stannade framför en tavla av ån utanför. Först efter en stund upptäckte han att konstnären hade målat samma plats under fyra olika årstider.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Beslutet om bron",
                "Svår",
                """
                        Efter flera månaders diskussioner skulle kommunfullmäktige slutligen besluta om den gamla järnvägsbron. Ingen ifrågasatte behovet av reparationer, men kostnaderna hade blivit betydligt högre än beräknat. Några föreslog att bron skulle rivas, medan andra ville göra den till en gångväg över älven. När mötet började överlämnade en grupp invånare en namninsamling, tillsammans med fotografier som visade hur mycket bron hade betytt för samhället.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Den försvunna ridån",
                "Svår",
                """
                        Två dagar före premiären upptäckte scenmästaren att den specialsydda ridån saknades i leveransen. Transportföretaget kunde bara bekräfta att paketet hade lämnats vid en lastkaj någonstans i staden. Medan regissören försökte anpassa föreställningen ringde kostymansvariga runt till andra teatrar. Till slut hittades ridån på ett hotell, där personalen hade antagit att den hörde till dekorationerna inför helgens stora konferens.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Dörren under trappan",
                "Svår",
                """
                        Vid besiktningen av det nedlagda pensionatet upptäckte Leila ett utrymme som saknades på ritningarna. Bakom en låg dörr under trappan ledde några ojämna steg ner till ett källarrum. Väggarna var torra, men golvet täcktes av ett tunt lager damm. Mitt i rummet stod ett skrivbord med en utdragen låda. Där låg ett nyckelknippe och en förteckning över gäster som aldrig hade skrivits in i receptionens bok.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Färjan i dimman",
                "Svår",
                """
                        Dimman låg så tät över sundet att passagerarna knappt kunde urskilja räcket längst fram på färjan. Motorernas jämna vibrationer fortplantade sig genom däcket, medan mistluren då och då bröt tystnaden. Vid relingen stod Henrik och försökte avgöra hur långt de hade kommit. När ett dovt svar hördes någonstans framför dem sänktes hastigheten omedelbart, och en besättningsman bad alla att gå in.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Förseningen på fjällstationen",
                "Svår",
                """
                        Helikoptern som skulle leverera förnödenheter hade tvingats vända på grund av den kraftiga sidvinden. På fjällstationen gick personalen igenom förråden och räknade ut hur länge maten skulle räcka om ovädret fortsatte. Gästerna samlades i matsalen för att få information. Trots osäkerheten var stämningen förhållandevis lugn, och flera erbjöd sig att hjälpa till med vedhämtning, matlagning och fördelning av de extra filtarna.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Klockan i stationshuset",
                "Svår",
                """
                        Ingen hade lyckats förklara varför stationshusets klocka stannade vid samma tid varje torsdag. Urmakaren hade undersökt mekanismen, bytt slitna delar och försäkrat kommunen om att felet var åtgärdat. Ändå stod visarna återigen stilla när Viktor passerade torget veckan därpå. Den här gången upptäckte han också något annat: i fönstret under urtavlan blinkade ett svagt ljus, trots att byggnaden sedan länge var övergiven.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Konserten i växthuset",
                "Svår",
                """
                        Arrangörerna hade förvandlat det övergivna växthuset till en tillfällig konsertlokal, där ljusslingor hängde mellan järnbalkarna och publiken satt bland stora krukväxter. Under den första låten började regnet smattra mot glastaket. Musikern sänkte tempot och lät ljudet bli en del av framförandet. Det som först hade verkat störande gav plötsligt musiken en rytm som ingen hade kunnat planera i förväg.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Körsbärsträden på innergården",
                "Svår",
                """
                        När bostadsföreningen presenterade planerna på en ny parkeringsyta upptäckte de boende att gårdens körsbärsträd skulle behöva fällas. Flera uppskattade de extra platserna, men andra ville bevara skuggan och den gemensamma sittplatsen under grenarna. Efter en gemensam vandring över området ritade en landskapsarkitekt ett alternativt förslag. Genom att flytta infarten och minska antalet platser kunde föreningen behålla två av de tre gamla träden.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Läsningen inför publiken",
                "Svår",
                """
                        Författaren hade läst samma utdrag högt otaliga gånger hemma, men inför publiken kändes meningarna plötsligt obekanta. Hon stannade efter första stycket, tog en klunk vatten och började om i ett långsammare tempo. Längst fram satt en pojke som följde varje ord med blicken. När hon kom till scenens sista rad vågade hon äntligen se upp och märkte att hela rummet hade blivit stilla.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Mötet i den gamla skolan",
                "Svår",
                """
                        Invånarna hade samlats i den nedlagda skolans gymnastiksal för att diskutera byggnadens framtid. Förslagen sträckte sig från bostäder till verkstäder och en gemensam samlingslokal. Diskussionen blev livlig när kostnaderna presenterades, men stannade av när en äldre kvinna reste sig. Hon berättade att byn redan en gång hade räddat skolan genom frivilligt arbete och undrade om det verkligen var omöjligt att försöka igen.
                        """.strip()
        ));

        texts.add(new TypingText(
                "När dammluckorna öppnades",
                "Svår",
                """
                        Vattennivån hade stigit under flera dygn, och vid gryningen fattades beslutet att öppna dammluckorna. Ett kraftigt dån fyllde dalgången när vattnet pressades genom de smala öppningarna. Längre nedströms stod räddningstjänsten beredd att spärra av vägen om älven svämmade över. Ingenjören följde mätvärdena på sin skärm och meddelade att trycket äntligen minskade, men att de fortfarande behövde övervaka sluttningen närmast kraftverket.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Renoveringen av biografen",
                "Svår",
                """
                        Bakom biografens slitna väggbeklädnad upptäckte hantverkarna en målning som ingen hade känt till. Den föreställde stadens torg, men flera av byggnaderna såg annorlunda ut än på äldre fotografier. Projektledaren avbröt arbetet och kontaktade museet för att få målningen undersökt. Längst ner i hörnet fanns en nästan utplånad signatur: samma efternamn som biografens första ägare, vars historia länge hade varit höljd i dunkel.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Repet vid färjeläget",
                "Svår",
                """
                        När vattenståndet sjönk upptäckte hamnvärden att ett förtöjningsrep hade fastnat under en utskjutande del av bryggan. Båten låg fortfarande stadigt, men repet spändes allt hårdare när vågorna lyfte skrovet. Han bad ägaren säkra båten med en extra lina innan de försökte lossa det. Först när belastningen hade fördelats kunde de försiktigt frigöra repet och kontrollera om fibrerna hade skadats mot kanten.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Segelbåten utanför leden",
                "Svår",
                """
                        Segelbåten hade kommit för långt österut när besättningen upptäckte att djupet minskade snabbare än väntat. Rorsmannen ändrade kurs medan de andra granskade sjökortet och försökte identifiera de låga skären framför dem. Vinden pressade båten mot grundare vatten, men efter en försiktig manöver nådde de tillbaka till farleden. Först då märkte de hur tysta alla hade blivit under de senaste minuterna.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Spåren över myren",
                "Svår",
                """
                        De första spåren syntes tydligt i leran där skogsvägen slutade, men längre ut på myren blev de allt svårare att följa. Patrik stannade vid en söndertrampad tuva och jämförde riktningen med kartan. Någon hade passerat här ganska nyligen, för vattnet hade ännu inte fyllt avtrycken. Samtidigt började vinden tillta, och bakom dem försvann skogsbrynet långsamt i ett tunt dis av regn.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Stigen längs ravinen",
                "Svår",
                """
                        Stigen blev smalare ju längre upp längs bergssidan de vandrade. Till vänster reste sig en brant klippvägg, och till höger försvann sluttningen ner i en dimhöljd ravin. Julia kontrollerade kartan ännu en gång, osäker på om markeringen verkligen visade rätt väg. När ett avlägset åskmuller hördes bakom bergen bestämde de sig för att vända, trots att raststugan borde ligga alldeles i närheten.
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
                "Strömavbrottet",
                "Svår",
                """
                        Precis när föreställningen skulle börja slocknade samtliga lampor i teatern. Ett förvånat sorl spred sig mellan stolsraderna, följt av ljudet från någon som tappade sitt program på golvet. Efter en stund tändes nödbelysningen ovanför utgångarna. Regissören klev fram till scenkanten och förklarade att reservsystemet hade slutat fungera, men att skådespelarna gärna fortsatte om publiken kunde tänka sig en ovanligt mörk premiär.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Upptäckten i verkstaden",
                "Svår",
                """
                        När den pensionerade snickarens verkstad skulle tömmas hittade hans dotter en halvfärdig trämodell under arbetsbänken. Den föreställde ett bostadshus med avtagbart tak och omsorgsfullt utformade rum. Bredvid låg ritningar med anteckningar om ljusinsläpp och tillgänglighet. Hon insåg så småningom att modellen visade huset han länge hade velat bygga, där hennes mamma skulle kunna ta sig fram utan trappor eller smala dörröppningar.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Vägen genom rasområdet",
                "Svår",
                """
                        Nattens skyfall hade dragit med sig jord och stenar över den enda vägen till byn. När arbetslaget kom fram syntes fortfarande små rörelser i sluttningen ovanför vägbanan. Arbetsledaren avbröt röjningen och bad alla att hålla avstånd medan området undersöktes. För byborna innebar väntan ännu en dag utan vanliga leveranser, men ingen ville riskera att maskinerna hamnade under ett nytt ras.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Återbruket i stationsmagasinet",
                "Svår",
                """
                        Det gamla stationsmagasinet hade fått nytt liv som verkstad för återbruk av möbler. Längs väggarna stod stolar med lösa ben, bord med repade skivor och skåp som väntade på nya gångjärn. Verksamhetsledaren visade besökarna hur en till synes obrukbar fåtölj kunde plockas isär och byggas upp igen. Det mest tidskrävande arbetet var ofta att bedöma vilka ursprungliga delar som faktiskt gick att bevara.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Återkomsten till perrongen",
                "Svår",
                """
                        Stationen hade förändrats mer än Daniel hade föreställt sig. Den gamla vänthallen var ersatt av glasväggar, och där biljettluckan hade funnits låg nu en liten restaurang. Ändå kände han genast igen ljudet när ett tåg bromsade in vid perrongen. Han stannade under stationsklockan och letade efter sin syster bland de resande, osäker på hur deras första möte på flera år skulle bli.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Arkivets sista anteckning",
                "Mycket svår",
                """
                        I protokollet från den 17 november 1936 saknades sidorna 42–47, trots att innehållsförteckningen uttryckligen hänvisade till dem. Arkivarien undersökte pärmens rygg och upptäckte rester av en omsorgsfullt avlägsnad söm. På insidan av omslaget stod en handskriven varning: "Kontrollera datumet innan handlingarna lämnas ut." Hon jämförde anteckningen med diariets övriga uppgifter; därefter låste hon dörren och ringde det nummer som någon hade skrivit längst ner.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Auktionen på herrgården",
                "Mycket svår",
                """
                        Utrop nummer 73 beskrevs i katalogen som en "mekanisk räknemaskin av okänt ursprung", med ett uppskattat värde på 8 500 kronor. Budgivningen började försiktigt men steg snabbt när två anonyma telefonköpare gav sig in i striden. Vid 125 000 kronor begärde auktionsförrättaren en kort paus. Under maskinens bottenplatta hade en medarbetare upptäckt en inskription: ett serienummer, geografiska koordinater och uppmaningen att aldrig återställa räkneverket till noll.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Avvikelsen i tidtabellen",
                "Mycket svår",
                """
                        Enligt den digitala tidtabellen skulle godståg 614 anlända klockan 01.32, men sensorerna registrerade dess passage redan 01.19. Trafikledaren jämförde uppgifterna med kamerabilderna från föregående station: där hade samma tåg passerat klockan 01.24. "Antingen går klockorna fel, eller också tittar vi på olika tåg", sade hon. Vagnarnas identifikationsnummer överensstämde dock fullständigt; dessutom visade samtliga system att tidssynkroniseringen fungerade utan anmärkning.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Beräkningen före uppskjutningen",
                "Mycket svår",
                """
                        Nedräkningen avbröts vid 00.48 när styrsystemet rapporterade en avvikelse på 0,07 grader i farkostens orientering. Teknikerna jämförde omedelbart sensorerna A-2 och A-3, vars mätvärden normalt skulle överensstämma. "Bekräfta referenspunkten innan någon parameter ändras", sade flygledaren. Efter ytterligare 90 sekunder stod orsaken klar: en uppdaterad kalibreringsfil hade laddats i endast ett av systemen; uppskjutningen kunde återupptas först när båda använde samma koordinatmodell.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Budgeten som inte stämde",
                "Mycket svår",
                """
                        Projektets sammanställning visade ett överskott på 48 750 kronor, medan ekonomisystemet redovisade ett underskott på 12 300 kronor. Controllern jämförde därför verifikationerna 201–246 med underlaget från avdelning B-4. "Kontrollera om kreditfakturan har registrerats två gånger", föreslog projektledaren. Differensen visade sig dock bero på tre separata fel: en utebliven periodisering, ett omvänt belopp och en kostnad som bokförts på fel projekt; rapporten behövde korrigeras före torsdagens styrelsemöte.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Den felaktiga leveransen",
                "Mycket svår",
                """
                        Leverans 508-B skulle innehålla 1 250 komponenter med en diameter på 4,8 millimeter, men stickprovet visade genomgående 5,2 millimeter. Kvalitetsansvariga jämförde följesedeln med beställningen och upptäckte två nästan identiska artikelnummer: AX-17 och AX-71. "Stoppa monteringen tills vi har verifierat hela partiet", meddelade produktionschefen. Felet verkade begränsat till en enda pall; spårbarhetsregistret visade dock att ytterligare tre leveranser hade packats enligt samma felaktiga instruktion.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Experimentet i växthuset",
                "Mycket svår",
                """
                        Försök nummer 28 inleddes klockan 06.45, när växthusets automatiska bevattningssystem aktiverades. Luftfuktigheten låg på 83,5 procent och temperaturen hölls konstant vid 21,8 grader. Trots identiska förhållanden utvecklades plantorna i sektion B betydligt snabbare än kontrollgruppen. "Det måste finnas en variabel vi har förbisett", konstaterade försöksledaren. När resultaten sammanställdes framträdde ett oväntat mönster: tillväxten ökade endast under de minuter då ventilationssystemet var avstängt.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Fel rad i deltagarlistan",
                "Mycket svår",
                """
                        Vid importen av deltagarlistan hade 47 av 286 poster fått fel grupptillhörighet. Administratören jämförde filerna anmalan_v2.csv och grupper_v3.csv och upptäckte att sorteringen skilde sig åt. "Koppla samman posterna via deltagar-ID, aldrig genom radnumret", påpekade systemansvariga. Ett stickprov på ID 1042, 1087 och 1203 bekräftade orsaken; efter en korrigerad import kontrollerades samtliga kopplingar innan scheman och rumsfördelning publicerades för kursens deltagare.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Inspektionen av tunneln",
                "Mycket svår",
                """
                        Vid kontrollpunkt T-09 uppmättes en sprickbredd på 2,6 millimeter, jämfört med 1,1 millimeter vid föregående inspektion. Ingenjören noterade förändringen i protokollet och fotograferade området med en graderad mätskala som referens. "Begränsa belastningen tills analysen är klar", rekommenderade hon. Den preliminära beräkningen visade en säkerhetsmarginal på 18 procent; osäkerheten i underlaget var emellertid så stor att resultatet behövde kontrolleras mot kompletterande mätningar innan tunneln kunde öppnas helt.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Inventeringen av myntsamlingen",
                "Mycket svår",
                """
                        Föremål 309 beskrevs som ett silvermynt från 1624, med vikten 6,8 gram och diametern 27 millimeter. Vid inventeringen uppmättes emellertid 7,3 gram, trots att vågen nyligen hade kalibrerats. Numismatikern granskade kanten under förstoring och noterade en oregelbunden skarv. "Jämför med fotografierna från förvärvet", bad hon. Bilderna visade samma repor och missfärgningar; däremot saknades skarven, vilket väckte frågan om föremålet hade förändrats eller ersatts efter den senaste dokumentationen.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Korrekturet före tryckstart",
                "Mycket svår",
                """
                        Tryckeriets sista korrektur omfattade 128 sidor i formatet 148 × 210 millimeter. På sidan 76 stod priset 1 995 kronor, men i beställningsunderlaget angavs 1 595 kronor inklusive moms. Redaktören markerade avvikelsen och skrev: "Kontrollera även tabellen i bilaga B." Där hade två kolumnrubriker bytt plats; upplagan på 3 200 exemplar fick därför vänta tills både prisuppgiften och tabellens läsordning hade godkänts på nytt.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Luftprovet från växthall C",
                "Mycket svår",
                """
                        Mätserie C-14 visade en koldioxidhalt på 1 180 ppm klockan 08.25, jämfört med börvärdet 850 ppm. Teknikern jämförde resultatet med referensgivaren (ID 703) och noterade en skillnad på 12 procent. "Avvakta med regleringen tills givarna har kontrollerats", sade försöksledaren. Efter rengöring och kalibrering överensstämde instrumenten inom angiven tolerans; den återstående förhöjningen kunde då kopplas till en ventil som inte hade öppnats enligt styrsystemets schema.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Manuskriptets marginaler",
                "Mycket svår",
                """
                        På sidorna 118–123 i manuskriptet återkom samma ovanliga teckenföljd: Q7, R4 och M9. Bibliotekarien antog först att det rörde sig om senare katalogmarkeringar, men bläckets sammansättning överensstämde med originaltextens. "Läs anteckningarna i omvänd ordning", föreslog hennes kollega. När de följde rådet framträdde en hänvisning till hylla 6C; där förvarades en kartbok vars innehållsförteckning saknade just de orter som nämndes i manuskriptets sista kapitel.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Mottagaren på taket",
                "Mycket svår",
                """
                        Antennen på byggnad C-7 var riktad mot 142,5 grader, men mottagarens signalstyrka låg 18 procent under det förväntade värdet. Teknikern kontrollerade kablar, anslutningar och förstärkning utan att hitta något uppenbart fel. "Mät igen med reservmottagaren och samma inställningar", sade arbetsledaren. När jämförelsen var klar återstod en tydlig avvikelse: störningen uppträdde endast mellan 13.20 och 13.35, precis när ventilationsanläggningen i grannfastigheten kördes på högsta effekt.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Mätstationen på glaciären",
                "Mycket svår",
                """
                        När expeditionen nådde mätstation K-12 hade temperaturen fallit till minus 18,6 grader och vindhastigheten översteg 20 meter per sekund. Instrumentpanelen visade normala värden, men den senaste positionsangivelsen avvek med 37 meter från föregående dygns mätning. Glaciologen kontrollerade förankringarna och begärde därefter satellitbilder från området. Förskjutningen kunde knappast bero på isens vanliga rörelse; frågan var om hela bergspartiet under stationen hade börjat ge vika.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Observatoriet på berget",
                "Mycket svår",
                """
                        Klockan 22.47 öppnades taket på det lilla observatoriet högst uppe på berget. Temperaturen hade sjunkit till minus fyra grader, och den klara vinterluften gjorde stjärnhimlen ovanligt tydlig. Astronomen justerade teleskopets position med några millimeter och kontrollerade koordinaterna ännu en gång. Någonstans mellan Cassiopeia och Andromeda syntes ett svagt ljus som inte hade funnits på gårdagens fotografier; frågan var om det verkligen var något nytt.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Oväntad trafik i serverhallen",
                "Mycket svår",
                """
                        Klockan 04.12 ökade den utgående trafiken från server S-16 till 875 megabit per sekund, trots att den schemalagda säkerhetskopieringen redan var avslutad. Driftteknikern granskade loggfilerna och identifierade 64 upprepade anslutningsförsök till en okänd adress. "Isolera servern och bevara loggarna", instruerade incidentledaren. En närmare undersökning visade att ett felkonfigurerat övervakningsverktyg skickade samma datapaket kontinuerligt; överföringen upphörde först när den automatiska omstartsfunktionen hade inaktiverats.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Provet i laboratoriet",
                "Mycket svår",
                """
                        Analysprovet märkt R-204 skulle förvaras vid minus 72 grader, men temperaturloggen visade en kortvarig ökning till minus 11,4 grader klockan 02.56. Laboratoriechefen begärde omedelbart en kontroll av reservaggregatet. "Dokumentera varje avvikelse, även om den verkar obetydlig", instruerade hon. Vid den efterföljande granskningen upptäcktes att frysdörren hade registrerats som öppen i exakt 38 sekunder; passersystemet visade däremot att ingen hade befunnit sig i rummet.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Restaureringen av takmålningen",
                "Mycket svår",
                """
                        Restaureringsarbetet i sal 3B beräknades kosta 245 000 kronor och omfatta en takyta på 86,5 kvadratmeter. När konservatorn avlägsnade det översta färgskiktet framträdde emellertid en äldre komposition: fyra gestalter kring ett bord, omgivna av astronomiska symboler. I marginalen stod årtalet 1789 och initialerna E. L. "Vi behöver undersöka pigmenten innan vi fortsätter", förklarade hon; en felaktig behandling kunde annars förstöra de tunna linjer som fortfarande gick att urskilja.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Signalen från djuphavet",
                "Mycket svår",
                """
                        Klockan 03.18 registrerade forskningsfartygets instrument en återkommande signal från 2 400 meters djup. Först misstänkte besättningen ett tekniskt fel, men kontrollmätningen visade samma resultat: tre korta pulser, följda av exakt tolv sekunders tystnad. Marinbiologen granskade frekvenskurvan och skakade tveksamt på huvudet. Signalen liknade inget känt djurläte; dessutom tycktes dess ursprung förflytta sig mot havsströmmen, med en hastighet som utrustningen inte kunde förklara.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Textilens blekta signatur",
                "Mycket svår",
                """
                        Inventarienummer TX-406 avsåg en vävnad som enligt katalogen tillverkats omkring 1895. Under fotografering i snett ljus framträdde emellertid en blekt signatur och årtalet 1878 nära nederkanten. Konservatorn antecknade: "Undersök om kanten har vikts in vid en senare montering." Den synliga ytan mätte 92,4 × 61,8 centimeter; ytterligare sömsmån låg dold bakom ramen, vilket innebar att både dateringen och de registrerade måtten behövde omprövas.
                        """.strip()
        ));

        texts.add(new TypingText(
                "Tryckfallet i pumpstationen",
                "Mycket svår",
                """
                        Klockan 05.43 sjönk trycket i ledning P-08 från 6,2 till 3,9 bar, samtidigt som flödet ökade med 24 procent. Operatören jämförde värdena med givaren vid nästa mätpunkt och kontaktade underhållsgruppen. "Stäng ventil V-12 stegvis och följ förändringen", instruerade arbetsledaren. Trycket stabiliserades efter den andra justeringen; eftersom flödet fortfarande avvek från normalvärdet behövde sträckan mellan pumpstationen och reservoaren undersökas innan anläggningen kunde återgå till ordinarie drift.
                        """.strip()
        ));


        return texts;
    }

    public List<TypingText> loadTextsFromYaml() {
        InputStream inputStream = TypingTextCatalog.class.getResourceAsStream("/typing-texts.yaml");

        if (inputStream == null) {
            throw new IllegalStateException("Filen 'typing-texts.yaml' kunde inte hittas.");
        }

        Yaml yaml = new Yaml();
        Object data = yaml.load(inputStream);

        List<TypingText> loadedTexts = new ArrayList<>();

        if (data instanceof List<?> entries) {
            for (Object entry : entries) {
                if (entry instanceof Map<?, ?> textData) {
                    Object titleValue = textData.get("title");
                    Object difficultyValue = textData.get("difficulty");
                    Object textValue = textData.get("text");
                    if (titleValue instanceof String title
                            && difficultyValue instanceof String difficulty
                            && textValue instanceof String text) {
                        TypingText typingText = new TypingText(title, difficulty, text);
                        loadedTexts.add(typingText);
                    }
                }
            }
        } else {
            throw new IllegalStateException("Filen 'typing-texts.yaml' kunde inte bearbetas.");
        }
        return loadedTexts;
    }

    public TypingText findTextByDifficulty(String selectedDifficulty) {
        List<TypingText> texts = getTexts();
        List<TypingText> matchingTexts = new ArrayList<>();
        for (TypingText typingText : texts) {
            if (selectedDifficulty.equals(typingText.getDifficulty())) {
                matchingTexts.add(typingText);
            }
        }
        if (matchingTexts.isEmpty()) {
            return null;
        }
        Random random = new Random();
        int randomIndex = random.nextInt(matchingTexts.size());
        TypingText selectedText = matchingTexts.get(randomIndex);
        return selectedText;
    }

}