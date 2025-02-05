package Basics;

import java.util.Scanner;

public class ExampleScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        byte b = sc.nextByte();
        short c = sc.nextShort();
        long d = sc.nextLong();
        float e = sc.nextFloat();
        double f = sc.nextDouble();
        String s = sc.next();
        s = sc.nextLine();
        boolean bool=sc.nextBoolean();

    }
}
