import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }

        // Prefix sum of original array
        long[] prefixOriginal = new long[n + 1];

        for (int i = 1; i <= n; i++) {
            prefixOriginal[i] = prefixOriginal[i - 1] + a[i];
        }

        // Sort the array
        Arrays.sort(a);

        // Prefix sum of sorted array
        long[] prefixSorted = new long[n + 1];

        for (int i = 1; i <= n; i++) {
            prefixSorted[i] = prefixSorted[i - 1] + a[i];
        }

        int q = sc.nextInt();

        while (q-- > 0) {
            int type = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();

            if (type == 1) {
                System.out.println(
                    prefixOriginal[r] - prefixOriginal[l - 1]
                );
            } else {
                System.out.println(
                    prefixSorted[r] - prefixSorted[l - 1]
                );
            }
        }

        sc.close();
    }
}
