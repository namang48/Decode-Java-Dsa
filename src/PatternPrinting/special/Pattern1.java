package PatternPrinting.special;

import java.util.Scanner;

public class Pattern1 {
    //Number Square
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
//        1 2 3 4
//        1 2 3 4
//        1 2 3 4
//        1 2 3 4
