package Conditional;

import java.util.Scanner;

public class GradingStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your marks : ");
        int mark=sc.nextInt();
        //funnel using if else ladder-the bigger marks will be caught and other will be skipped.
        if(mark>=81){
            System.out.println("A-Grade.");
        }else if(mark>=61){
            System.out.println("B-Grade.");
        }else if(mark>=41){
            System.out.println("C-Grade.");
        }else{
            System.out.println("D-Grade.");
        }
    }
}
