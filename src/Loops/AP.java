package Loops;

import java.util.Scanner;

public class AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        AP1(n);
        AP2(n);
    }

    //1 3 5 7 9 .....
    static void AP1(int n) {
        System.out.println("AP1");
        int a = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            a += 2;
        }
    }

    //4 7 10 13 .....
    static void AP2(int n) {
        System.out.println("AP2");
        int a = 4;
        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            a += 3;
        }
    }
}
