package Loops;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        int count=0;

       do{
            count++;
            num/=10;
        }while(num!=0);
        System.out.println("Number of digits : " + count);
    }
}
