package projecteuler;

public class Problem_001 {

    public static void main(String[] args) {
        int sum = sumOfMultiples(10);
        System.out.println(sum);

        sum = sumOfMultiples(1000);
        System.out.println(sum);
    }

    private static int sumOfMultiples(int inputNum) {
        int sum = 0;
        for (int num = 0; num < inputNum; num++) {
            if (num % 3 == 0 || num % 5 == 0) {
                sum = sum + num;
            }
        }
        return sum;
    }
}
