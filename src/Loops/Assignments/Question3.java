package Loops.Assignments;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for Greatest Common Divisor : ");
        System.out.print("Enter First num : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second num : ");
        int num2 = sc.nextInt();
        int flag = 0, small = (num1 <= num2) ? num1 : num2;

        for (int i = 2; i <= small; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                System.out.println("GCD = " + i);
                flag++;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("GCD = " + (1));
        }

    }
}
