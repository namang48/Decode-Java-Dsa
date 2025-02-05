package Conditional;

import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        //ifElseReplacement();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Expression with space between them :");
        int a = sc.nextInt();
        char op = sc.next().charAt(0);
        int b = sc.nextInt();
        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            default:
                System.out.println("Enter valid operator !");
        }
    }

//    static void ifElseReplacement() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Expression with space between them :");
//        int a = sc.nextInt();
//        char op = sc.next().charAt(0);
//        int b = sc.nextInt();
//
//        if (op == '+') System.out.println(a + b);
//        if (op == '-') System.out.println(a - b);
//        if (op == '*') System.out.println(a * b);
//        if (op == '/') System.out.println(a / b);
//    }
}
