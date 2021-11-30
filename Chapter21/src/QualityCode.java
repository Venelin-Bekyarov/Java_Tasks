public class QualityCode {
    public static void main(String[] args) {
/*
        final int SWITCH_VALUE = 10; - it's constant - we can't change 10 to other value.
        int (i) loopBoundary = 5; - not final as it was divided by (;) not (,) on the line after "... = 010".
        switch (SWITCH_VALUE) {
            case 10:   - no result/further action.
                w = 5;
            case 9:    - unreachable (constant value = 10).
                i = 0;
            case 8:    - unreachable (constant value = 10).
                System.out.print(" 9 %n 9 %n 9 ");
            default:   - the only reachable statement- the whole switch case is redundant and should be removed.
                System.out.print("4");  - "4" will be printed only.
                break;
                }
 */
        int loopBoundary = 5;
        final int VALUE_F = Character.getNumericValue('f');
        for (int k = 0; k < loopBoundary; k++) {
            System.out.printf("result: %d %n", (k - VALUE_F));
        }
        System.out.println("4");
        System.out.println("Cycle");
    }
}
