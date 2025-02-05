package PatternPrinting.compositePatterns;

import java.util.Scanner;

public class FlippedNumberTriangle {
    public static void main(String[] args) {
        //Flipped Number Triangle
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
//        FlippedNumberTriangle ob=new FlippedNumberTriangle();
//        ob.method2(n);

        for (int i = 1; i <= n; i++) {
            int a=1;
            for (int j = 1; j <= n; j++) {
                if (i+j>n) {
                    System.out.print(a++ +" ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    void method2StarFlipped(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i ; j++){      //spaces loop
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){          //stars loop
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    void method2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i ; j++){      //spaces loop
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){          //numbers loop
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}
