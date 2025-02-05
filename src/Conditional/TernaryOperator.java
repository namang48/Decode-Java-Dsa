package Conditional;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer : ");
        int num = sc.nextInt();
        System.out.println((num > 0) ? "Positive" : "Negative");
    }
}
