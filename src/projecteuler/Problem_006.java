package projecteuler;

public class Problem_006 {

    public static void main(String[] args) {
        long sumOfSquares = sumOfSquares(100);
        long squareOfSum = squareOfSum(100);

        System.out.println(squareOfSum - sumOfSquares);
    }

    private static long sumOfSquares(int num) {
        long sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i * i;
        }
        return sum;
    }

    private static long squareOfSum(int num) {
        long sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        return sum * sum;
    }
}
