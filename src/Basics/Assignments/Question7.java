package Basics.Assignments;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        float num1 = sc.nextFloat();
        System.out.print("Enter 2nd number : ");
        float num2 = sc.nextFloat();
        boolean flag = (num1 == num2);  System.out.println("Are numbers equal ?   " + flag);
        flag=(num1 != num2);            System.out.println("Are numbers not equal ?   "+ flag);
        flag=(num1 > num2);             System.out.println("Is the first number greater ?   "+ flag);
        flag=(num1 < num2);             System.out.println("Is the first number less ?   "+ flag);
    }
}
