package PatternPrinting.shapes;

import java.util.Scanner;

public class StarSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side : ");
        int a=sc.nextInt();
        for(int i=1 ; i<=a ; i++){
            for(int j=1; j<=a; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
