package Conditional;

import java.util.Scanner;

public class QuadrantFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of x co-ordinate : ");
        int x = sc.nextInt();
        System.out.print("Enter Value of y co-ordinate : ");
        int y = sc.nextInt();

        if (x > 0) {
            if (y > 0) {
                System.out.println("1st Quadrant.");
            } else if (y == 0) {
                System.out.println("X - Axis.");
            } else {
                System.out.println("4th Quadrant.");
            }
        } else if (x == 0) {
            if (y == 0) {
                System.out.println("Origin.");
            } else {
                System.out.println("Y - Axis.");
            }
        } else {
            if (y > 0) {
                System.out.println("2nd Quadrant.");
            } else if (y == 0) {
                System.out.println("X - Axis.");
            } else {
                System.out.println("3rd Quadrant.");
            }
        }
    }
}
