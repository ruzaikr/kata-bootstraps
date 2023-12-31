public class Calculator {

    public static int multiply(final int num1, final int num2) {

        int result = 0;

        // how to get 25 from 5 and 5
        for (int i = 0; i < Math.abs(num2); i++) {
            if (num1 < 0 && num2 < 0) {
                result += Math.abs(num1);
                continue;
            }

            if (num1 > 0 && num2 < 0) { // num1 +, num2 -
                result -= num1;
                continue;
            }

            result += num1;
        }

        return result;
    }

}
