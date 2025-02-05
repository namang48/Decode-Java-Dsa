package Recursion;

import java.util.Scanner;

public class Example2 {
    public static void print1toN(int x,int n){  //using extra variable
        if(x>n)    return;
        System.out.print(x+" ");        //work
        print1toN(x+1,n);            //call
    }
    public static void printIncreaseAfterCall(int n){
        //work after call does the job in reverse order
        if(n==0) return;
        printIncreaseAfterCall(n-1);    //call
        System.out.println(n);      //work after call
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Print 1 to N : ");
        System.out.println("Enter n : ");
        int n=sc.nextInt();
        //print1toN(1,n);
        printIncreaseAfterCall(n);
    }
}
