package projecteuler;

public class Problem_003 {

    public static void main(String[] args) {
        primeFactors(13195);
        primeFactors(600851475143L);
    }

    private static void primeFactors(long num) {
        for (long i = 2; i <= num; i++) {
            while (num % i == 0) {
                System.out.println(i);
                num = num / i;
            }

        }
    }
}
