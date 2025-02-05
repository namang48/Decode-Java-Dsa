package Basics.Assignments;

public class Question4 {
    public static void main(String[] args) {
        int temp = 10;
        System.out.println("Original Value : " + temp);
        int a = ++temp;
        System.out.println("After Increment : " + temp);
        int b = --temp;
        System.out.println("After Decrement : " + temp);
        System.out.println("Remainder : " + a % b);
    }
}
