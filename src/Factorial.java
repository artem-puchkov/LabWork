public class Factorial {
    public static void main(String[] args) {
        FactorialCounter factorial = new FactorialCounter();

        int number = 6;

        int res = factorial.calculateFactorial(number);

        System.out.println(res);
    }
}

class FactorialCounter{
    public int calculateFactorial(int number){
        int ans = 1;
        for (int i = 1; i <= number; i++) {
            ans *= i;
        }

        return ans;
    }
}
