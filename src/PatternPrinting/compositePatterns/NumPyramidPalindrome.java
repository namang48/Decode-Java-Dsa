package PatternPrinting.compositePatterns;

import java.util.Scanner;

public class NumPyramidPalindrome {
    public static void main(String[] args) {
        //Number Pyramid Palindrome Rev
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n : ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int j=i-1;j>0;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
