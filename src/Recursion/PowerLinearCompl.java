package Recursion;

import java.util.Scanner;

public class PowerLinearCompl {
    public static int pow(int a,int b){     //Linear complexity
        if(a==0 && b==0){
            System.out.println("Not Defined !");
            return -1;
        }
        if(b==0)    return 1;
        return a*pow(a,b-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Base : ");
        int base=sc.nextInt();
        System.out.println("Enter Exponent : ");
        int exp=sc.nextInt();
        System.out.println("Answer : "+pow(base,exp));
    }
}
