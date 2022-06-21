package projecteuler;

public class Problem_004 {

    public static void main(String[] args) {
        palindromeNumber(999);
    }

    private static void palindromeNumber(int num) {
        long maxProductValue = 0;
        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= num; j++) {
                long product = i * j;
                StringBuilder sb = new StringBuilder(String.valueOf(product));
                if (sb.toString().equals(sb.reverse().toString())) {
                    if (maxProductValue < product) {
                        maxProductValue = product;
                    }
                }
            }
        }
        System.out.println(maxProductValue);
    }

}
