import java.util.*;

public class Main {

    static boolean isPrime(long n) {
        if (n < 2) return false;

        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n-- > 0) {
            long x = sc.nextLong();

            long root = (long) Math.sqrt(x);

            // Check whether x is a perfect square
            if (root * root == x && isPrime(root)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
