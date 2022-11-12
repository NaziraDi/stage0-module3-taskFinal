package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {

        int reversedNumber = 0;
        int numberToReverse = Math.abs(number);

        while (numberToReverse > 0) {
            int mod = numberToReverse % 10;
            reversedNumber = reversedNumber * 10 + mod;
            numberToReverse/= 10;
        }
        System.out.println(reversedNumber);
    }
}
