import java.util.ArrayList;

public class C13_04 {
    public static void main(String[] args) {
        ArrayList<String> badWords = new ArrayList<>();
        badWords.add("Java");
        badWords.add("JVM");
        badWords.add("Microsoft");
        String test = "Microsoft announced its next generation Java compiler today. It\n" +
                "uses advanced parser and special optimizer for the Microsoft JVM.";
        for (int i = 0; i < badWords.size(); i++) {
            test = test.replaceAll("(?i)" + badWords.get(i), "****");
        }
        test = test.replaceAll("\\w*\\*{4}", "****");
        System.out.println(test);
    }
}
