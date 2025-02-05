package Basics.Assignments;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Area of a circle
        System.out.print("Enter the radius of the circle : ");
        double r = scan.nextDouble();
        double area = 3.141592 * r * r;
        System.out.println("Area of Circle : " + area);


        //Simple Interest
        System.out.print("\nEnter principle amount : ");
        float principle = scan.nextFloat();
        System.out.print("Enter rate of interest : ");
        float rate=scan.nextFloat();
        System.out.print("Enter time ( in year ) : ");
        float time=scan.nextFloat();
        double si=principle * rate * time / 100;
        System.out.println("Simple Interest : " + si);


    }
}
