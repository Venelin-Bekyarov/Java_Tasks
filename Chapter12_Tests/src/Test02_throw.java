public class Test02_throw {
    public static void main(String... args) {
        RuntimeException exception = new RuntimeException("Problem");
        throw exception;
    }
}
