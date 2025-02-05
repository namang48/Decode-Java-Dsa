package PatternPrinting.special;

import java.util.Scanner;

public class StarPlus {
    public static void main(String[] args) {
        //Star Plus Symbol
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an odd number n : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == (n + 1) / 2 || j == (n + 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
