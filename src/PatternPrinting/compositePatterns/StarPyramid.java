package PatternPrinting.compositePatterns;

import java.util.Scanner;

public class StarPyramid {
    public static void main(String[] args) {
        //Flipped Number Triangle
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {      //spaces loop
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {      //stars loop
                System.out.print("* ");
            }
            System.out.println();
        }
        method2(n);
    }

    static void method2(int n) {
        int nsp = n - 1, nst = 1;
        for (int i = 1; i <= n; i++) {
            nst=2*i-1;
            for (int j=1;j<=nsp;j++) {      //spaces loop
                System.out.print("  ");
            }
            for (int j=1;j<=nst;j++) {      //stars loop
                System.out.print("* ");
            }
            nst+=2;nsp--;
            System.out.println();
        }
    }

}
