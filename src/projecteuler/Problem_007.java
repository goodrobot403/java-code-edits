package projecteuler;

public class Problem_007 {

    public static void main(String[] args) {

        int num = 0;
        int count = 0;
        while (true) {
            if (isPrime(num)) {
                count++;
                System.out.println(num);
            }
            if (count == 10001) {
                break;
            }
            num++;
        }
    }


    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
