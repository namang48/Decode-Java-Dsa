package Conditional;

import java.util.Scanner;

public class ThreeDigitNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter a number : ");
        int num=sc.nextInt();
        if(num >99 && num<1000){
            System.out.println("3 digit number .");
        }else{
            System.out.println("Not a 3 digit number . ");
        }
    }
}
