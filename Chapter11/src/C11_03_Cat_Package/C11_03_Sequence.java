package C11_03_Cat_Package;

public class C11_03_Sequence {

        private static int currentValue = -1;

        private C11_03_Sequence() {
        }

        public static int nextValue() {
            currentValue++;
            return currentValue;
        }
    }

