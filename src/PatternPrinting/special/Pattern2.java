package PatternPrinting.special;

import java.util.Scanner;

public class Pattern2 {
    //Alphabet Square
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n : ");
        int n=sc.nextInt();
        for(int i=1; i<=n ; i++){
            char ch='A';
            for(int j=1;j<=n ; j++){
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
//        Method2 m=new Method2();
//        m.Pattern2(n);
//        m.homeWork(n);
    }
}
class Method2{
    void Pattern2(int n){
        for(int i=1; i<=n ; i++){
            for(int j=1;j<=n ; j++){
                System.out.print((char)(j+64) + " ");
            }
            System.out.println();
        }
    }

    void homeWork(int n){
        for(int i=1; i<=n ; i++){
            for(int j=1;j<=n ; j++){
                System.out.print((char)(i+64) + " ");
            }
            System.out.println();
        }
    }
}
