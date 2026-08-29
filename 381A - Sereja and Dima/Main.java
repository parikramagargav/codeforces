/*Sereja and Dima

Sereja and Dima play a game. The rules of the game are very simple. The players have n cards in a row. Each card contains a number, all numbers on the cards are distinct. The players take turns, Sereja moves first. During his turn a player can take one card: either the leftmost card in a row, or the rightmost one. The game ends when there is no more cards. The player who has the maximum sum of numbers on his cards by the end of the game, wins.

Sereja and Dima are being greedy. Each of them chooses the card with the larger number during his move.

Inna is a friend of Sereja and Dima. She knows which strategy the guys are using, so she wants to determine the final score, given the initial state of the game. Help her.*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int left = 0;
        int right = n - 1;

        int sereja = 0;
        int dima = 0;

        boolean turnSereja = true;

        while (left <= right) {
            int chosen;

            if (a[left] > a[right]) {
                chosen = a[left];
                left++;
            } else {
                chosen = a[right];
                right--;
            }

            if (turnSereja) {
                sereja += chosen;
            } else {
                dima += chosen;
            }

            turnSereja = !turnSereja;
        }

        System.out.println(sereja + " " + dima);
    }
}
