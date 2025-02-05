package Conditional;

import java.util.Scanner;

public class AreaPerimeterCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter length of Rectangle : ");
        int l = sc.nextInt();
        System.out.println("Please enter breadth of Rectangle : ");
        int b = sc.nextInt();
        int area = l * b;
        int p = 2 * (l + b);
        if(area>p) System.out.println("Area is greater than Perimeter.");
        else System.out.println("Perimeter is greater than Area.");
    }
}
