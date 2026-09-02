import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] suffixDistinct = new int[n];

        HashSet<Integer> set = new HashSet<>();

        for (int i = n - 1; i >= 0; i--) {
            set.add(a[i]);
            suffixDistinct[i] = set.size();
        }

        while (m-- > 0) {
            int l = sc.nextInt();
            System.out.println(suffixDistinct[l - 1]);
        }

        sc.close();
    }
}
