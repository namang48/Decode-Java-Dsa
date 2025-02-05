package Recursion;

import java.util.Scanner;

public class Example1{
    public static void printNto1(int n){
        if(n==0)    return;         //return
        printNto1(n-1);             //call
        System.out.println(n+" ");  //work before call
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Print N to 1 :");
        System.out.println("Enter n : ");
        int n=sc.nextInt();
        printNto1(n);
    }
}
