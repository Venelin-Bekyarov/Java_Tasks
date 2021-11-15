import java.util.Objects;

public class C13_03 {
    public static void main(String[] args) {
        String text = "We are living in a <upcase>yellow submarine</upcase>. We don't\n" +
                "have <upcase>anything</upcase> else.";
        System.out.println(toUpperCase(text));
    }

    static String toUpperCase(String input) {

        String[] splitText = input.split("[<>]");
        StringBuilder result = new StringBuilder(input.length());
        for (int i = 0; i < splitText.length; i++) {
            if (!Objects.equals(splitText[i], "upcase") && !Objects.equals(splitText[i], "/upcase")) {
                result.append(splitText[i]);
            } else if (Objects.equals(splitText[i], "upcase")) {
                result.append(splitText[i + 1].toUpperCase());
                i++;
            }
        }
        return result.toString();
    }
}
