package PatternPrinting.special;

import java.util.Scanner;

public class NaturalTriangle {
    public static void main(String[] args) {
        //NATURAL NUMBER TRIANGLE
        //FLYOD'S TRIANGLE
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int a = 1, n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }

    }
}
