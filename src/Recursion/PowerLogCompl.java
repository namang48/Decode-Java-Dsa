package Recursion;

import java.util.Scanner;

public class PowerLogCompl {
    public static int pow(int a,int b){
        if(b==0)    return 1;
        int ans=pow(a,b/2);
        if(b%2==0)  return ans*ans;
        else return ans*ans*a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Base : ");
        int base=sc.nextInt();
        System.out.print("Enter Exponent : ");
        int exp=sc.nextInt();
        System.out.println("Answer : "+pow(base,exp));
    }
}
