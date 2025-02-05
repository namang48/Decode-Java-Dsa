package Conditional;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" : Profit Loss Program : ");
        System.out.print("Enter cost price : ");
        int cp=sc.nextInt();
        System.out.print("Enter selling price : ");
        int sp=sc.nextInt();
        if(sp>cp){
            System.out.println("Profit : " + (sp-cp));
        }else if(cp>sp){
            System.out.println("Loss : " + (cp-sp));
        }else{
            System.out.println("Neither Profit nor Loss !");
        }
    }
}
