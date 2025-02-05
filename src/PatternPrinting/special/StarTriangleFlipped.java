package PatternPrinting.special;

import java.util.Scanner;

public class StarTriangleFlipped {
    public static void main(String[] args) {
        //Star Triangle Flipped
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i+j<n+1) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
