import java.util.Arrays;

public class C13_07 {
    public static void main(String[] args) {

        String example = "one\two\three";
        String overridden = (example.replace("\t", "\\t"));
        String[] defractor = overridden.split("\\\\");
        String result = Arrays.toString(defractor);
        System.out.println(result);
    }
}
