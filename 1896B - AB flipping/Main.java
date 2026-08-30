/*AB Flipping
time limit per test1 second
memory limit per test256 megabytes
You are given a string s
 of length n
 consisting of characters A
 and B
. You are allowed to do the following operation:

Choose an index 1≤i≤n−1
 such that si=A
 and si+1=B
. Then, swap si
 and si+1
.
You are only allowed to do the operation at most once for each index 1≤i≤n−1
. However, you can do it in any order you want. Find the maximum number of operations that you can carry out.*/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int l = 0;
            int r = n - 1;

            // Skip B's from the beginning
            while (l < n && s.charAt(l) == 'B') {
                l++;
            }

            // Skip A's from the end
            while (r >= 0 && s.charAt(r) == 'A') {
                r--;
            }

            System.out.println(Math.max(0, r - l));
        }

        sc.close();
    }
}
