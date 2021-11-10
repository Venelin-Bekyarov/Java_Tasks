import java.util.Random;

public class C11_05 {
    static final String[] advertPhrases = new String[]{"Excellent product.", "A great product.", "I'm using this product all the time.", "That's the best product of it's class!"};
    static final String[] advertEvents = new String[]{"I feel better now.", "I managed to change myself.", "The result was a miracle.",
            "Can't believe, but I feel great now!", "Try it yourself, I am very satisfied."};
    static final String[] firstNameAuthor = new String[]{"Diana", "Polly", "Stella", "Ellen", "Kate"};
    static final String[] secondNameAuthor = new String[]{"Jones", "Peterson", "Kersley"};
    static final String[] cities = new String[]{"London", "Manchester", "Birmingham", "Liverpool", "Southampton"};
    static Random indexRandomGenerator;

    public static void main(String[] args) {
        indexRandomGenerator = new Random();
        String phrase = getRandomPhrase(advertPhrases);
        String eventAdvert = getRandomPhrase(advertEvents);
        String firstName = getRandomPhrase(firstNameAuthor);
        String secondName = getRandomPhrase(secondNameAuthor);
        String city = getRandomPhrase(cities);

        System.out.printf("%s %s -- %s %s, %s", phrase, eventAdvert, firstName, secondName, city);
    }

    static String getRandomPhrase(String[] phrases) {
        int randomIndex = indexRandomGenerator.nextInt(phrases.length);
        String result = phrases[randomIndex];
        return result;
    }
}
