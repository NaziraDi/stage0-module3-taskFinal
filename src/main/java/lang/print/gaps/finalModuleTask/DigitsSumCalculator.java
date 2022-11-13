package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {

        int sum = 0;

        while (number > 0) {
            int mod = number % 10;
            sum = mod + sum;
            number/=10;
        }
        System.out.println(sum);
    }
}
