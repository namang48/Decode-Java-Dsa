package PatternPrinting.special;

import java.util.Scanner;

public class OddTriangle {
    public static void main(String[] args) {
        //ODD NUMBER TRIANGLE
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n : ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*i-1;j+=2){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        //method2
    }
    void method2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j+=2){
                System.out.print(2*j-1+" ");
            }
            System.out.println();
        }
    }
}
