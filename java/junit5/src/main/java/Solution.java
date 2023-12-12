public class Solution {

    public int fib(int input) {

        if (input == 0) {
            return 0;
        }

        if (input == 1) {
            return 1;
        }

        return fib(input -1) + fib(input -2);

    }

}
