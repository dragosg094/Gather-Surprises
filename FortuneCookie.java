package P2;

import java.util.ArrayList;
import java.util.Random;


public class FortuneCookie implements ISurprise {


    public static Random random = new Random();

    private static ArrayList<String> quotes = new ArrayList<>();

    public static String getResult() {
        return result;
    }

    public static void setResult(String result) {
        FortuneCookie.result = result;
    }

    private static String result;


    public static ArrayList<String> getQuotes() {
        return quotes;
    }

    public static void setQuotes(ArrayList<String> quotes) {

        quotes.add("In definitiv, nu anii din viata sunt cei care conteaza, ci viata din anii tai. - Abraham Lincoln");
        quotes.add("Trebuie sa traim si sa cream. Sa traim pâna la lacrimi. - Albert Camus");
        quotes.add("Îţi zic un secret, dragul meu: nu aştepta judecata de apoi, ea are loc în fiecare zi. - Albert Camus");
        quotes.add("Toate animalele, exceptând omul, ştiu principalul scop al vieţii: să te bucuri. - Albert Camus");
        quotes.add("Nu tot ceea ce poate fi numărat contează şi nu tot ceea ce contează poate fi numărat. - Albert Einstein");
        quotes.add("Conduita morală nu înseamnă pur şi simplu exigenţa de a renunţa anume la plăcerile vieţii, ci mai degrabă interesul plin de solicitudine pe care-l depune cineva ca să făurească o soartă mai bună pentru toţi oamenii. - Albert Einstein");
        quotes.add("Idealurile care mi-au luminat calea şi mi-au redat din timp în timp curajul de a înfrunta viaţa cu bucurie, au fost: bunătatea, frumuseţea şi adevărul. - Albert Einstein");
        quotes.add("Lumea pe care am creat-o este un proces al gândirii noastre. Nu poate fi schimbată fără a ne schimba gândirea. - Albert Einstein");
        quotes.add("Ce faci pentru tine, dispare odată cu tine, ce faci pentru alţii, rămâne pentru eternitate. - Albert Einstein");
        quotes.add("Un intelectual rezolvă problemele, un geniu le evită. - Albert Einstein");
        quotes.add("Uneori plătim mult mai mult pentru lucrurile pe care le primim pe gratis. - Albert Einstein");
        quotes.add("Viaţa însăşi este magie, iar dacă nu crezi asta, măcar încearcă să o trăieşti ca pe ceva magic. - Albert Einstein");
        quotes.add("Cel ce mărşăluieşte vesel în rând cu trupa, deja şi-a câştigat dispreţul meu. I s-a dat ditamai creierul din greşeală, din moment ce măduva spinării i-ar fi ajuns. - Albert Einstein");
        quotes.add("Ca să-ţi pierzi capul, trebuie să-l ai. - Albert Einstein");
        quotes.add("Sunt doua feluri de a-ti trai viata... Unul - de a crede ca nu exista miracole. Altul - de a crede ca totul este un miracol. - Albert Einstein");
        quotes.add("Averea cea mai de pret e viata, si viata noastra, va rog sa ma credeti, nu atarna decat de un fir de par. - Alexandre Dumas");
        quotes.add("Viata isi are farmecul ei, depinde numai cu ce ochi o privesti. - Alexandre Dumas fiul");
        quotes.add("Viata este o ciudata comedie care amesteca impreuna si dureri si bucurii, punand lacrimi langa zambet, punand zambet langa plans. - Alexandru Macedonski");
        quotes.add("Viata e felul in care un ins pare a se fi invoit cu inacceptabila conditie umana. - Andre Breton");
        quotes.add("A reflecta asupra vietii - asupra vietii in fata mortii - nu inseamna fara indoiala decat a ne aprofunda interogatia. - Andre Malraux");

        FortuneCookie.quotes = quotes;
    }

    @Override
    public void enjoy() {

        System.out.println(generate());
    }


    public static String generate() {
        ArrayList<String> quotes = new ArrayList<>();
        FortuneCookie.setQuotes(quotes);
        String surprise;

        surprise = quotes.get(random.nextInt(getQuotes().size()));
        setResult(surprise);



        return "Your Fortune Cookie says: " + surprise;
    }


}

