package PatternPrinting.compositePatterns;

import java.util.Scanner;

public class StarDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {      //First Part
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        for (int i = n-1; i >= 1; i--) {    //Second part
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        method2 m=new method2(n);
    }
}
class method2{
    method2(int n){
        int nsp=n-1,nst=1;
        for (int i = 1; i <= n; i++) {      //First Part
            for (int j = 1; j <= nsp; j++) {    //Spaces
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("*" + " ");
            }
            nsp--;nst+=2;
            System.out.println();
        }
        nsp=1;nst-=4;
        for (int i = 1; i <=n-1; i++) {        //Second Part
            for (int j = 1; j <= nsp; j++) {  //Spaces
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= nst; j++) {  //Stars
                System.out.print("*" + " ");
            }
            nsp++;nst-=2;
            System.out.println();
        }
    }
}