public class LocalClassExample {
        public static void main(String[] args) {
            final int value = 5;
            class LocalClass {
                void printSomething() {
                    System.out.println(value);
                }
            }
            LocalClass variableOfClass = new LocalClass();
            variableOfClass.printSomething();
        }
    }

