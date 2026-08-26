import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            // Find first position where a[i] != i + 1
            int l = 0;

            while (l < n && a[l] == l + 1) {
                l++;
            }

            // Find position containing l + 1
            int r = l;

            while (r < n && a[r] != l + 1) {
                r++;
            }

            // Reverse from l to r
            while (l < r) {
                int temp = a[l];
                a[l] = a[r];
                a[r] = temp;

                l++;
                r--;
            }

            // Print array
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
