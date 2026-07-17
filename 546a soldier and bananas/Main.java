import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();

        int totalCost = k * w * (w + 1) / 2;

        if (totalCost > n) {
            System.out.println(totalCost - n);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}
