package projecteuler;

public class Problem_005 {

    public static void main(String[] args) {
        evenlyDivisible(20);
    }

    private static void evenlyDivisible(int limit) {

        long num = 1;
        while(true) {
            boolean isEvenlyDivisible = true;
            for (int i = 1; i <= limit; i++) {
                isEvenlyDivisible = isEvenlyDivisible && (num % i == 0);
                if (!isEvenlyDivisible) {
                    break;
                }
            }
            if (isEvenlyDivisible) {
                System.out.println(num);
                break;
            }
            num++;
        }


    }
}
