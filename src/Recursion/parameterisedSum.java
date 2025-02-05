package Recursion;

import java.util.Scanner;

public class parameterisedSum {
    public static void sumParameterised(int n,int s){
        if(n==0){
            System.out.println("Sum = "+s);
            return;
        }
        sumParameterised(n-1,s+n);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n : ");
        int n=sc.nextInt();
        sumParameterised(n,0);
    }
}
