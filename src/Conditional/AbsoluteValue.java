package Conditional;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Absolute Value = " + (-num));
        } else {
            System.out.println("Absolute Value = " + num);
        }
    }
}
