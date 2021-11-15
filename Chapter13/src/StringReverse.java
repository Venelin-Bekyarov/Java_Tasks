public class StringReverse {
        public static void main(String[] args) {
            String someText = "EM edit";
            String reversed = reverseText(someText);
            System.out.println(reversed); // tide ME
        }
        public static String reverseText(String niz) {
            StringBuilder sb = new StringBuilder();
            for (int i = niz.length() - 1; i >= 0; i--)
                sb.append(niz.charAt(i));
            return sb.toString();
        }
    }