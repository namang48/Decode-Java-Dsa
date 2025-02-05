package PatternPrinting.triangle;

import java.util.Scanner;

public class RevStarTriangle {

    public static void main(String[] args) {
        //Reverse Star Triangle
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
