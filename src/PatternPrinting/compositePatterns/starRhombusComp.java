package PatternPrinting.compositePatterns;

import java.util.Scanner;

public class starRhombusComp {
    public static void main(String[] args) {
        //Flipped Number Triangle
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {      //spaces loop
                System.out.print("  ");
            }
            for (int j = 1; j <= n; j++) {          //alphabets loop
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
