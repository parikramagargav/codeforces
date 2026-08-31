import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = s.length();

        int[] prefix = new int[n];

        // prefix[i] = number of equal adjacent pairs
        // from s[0] to s[i]
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1];

            if (s.charAt(i) == s.charAt(i - 1)) {
                prefix[i]++;
            }
        }

        int m = sc.nextInt();

        while (m-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            // Convert 1-based positions to our prefix logic
            System.out.println(prefix[r - 1] - prefix[l - 1]);
        }

        sc.close();
    }
}
