package projecteuler;

public class Problem_002 {

    public static void main(String[] args) {
        fibonacci(1000);
    }

    private static void fibonacci(int n) {
        int a = 0;
        int b = 1;
        int evenSum = 0;
        for (int i = 1; i < n; i++) {
            int sum = a + b;
            a = b;
            b = sum;
            if (sum >= 4000000) {
                break;
            }
            if (sum % 2 == 0) {
                evenSum += sum;
            }
        }
        System.out.println(evenSum);
    }
}
