package Conditional;

import java.util.Scanner;

public class GreaterOfThree {
    public static void main(String[] args) {
//        findGreater();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println(a + " is greatest.");
            } else {
                System.out.println(c + " is greatest.");
            }
        } else {
            if (b > c) {
                System.out.println(b + " is greatest.");
            } else {
                System.out.println(c + " is greatest.");
            }
        }

    }

    public static void findGreater() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c) System.out.println(a + " is greatest.");
        if (b > a && b > c) System.out.println(b + " is greatest.");
        if (c > a && c > b) System.out.println(c + " is greatest.");
    }
}
