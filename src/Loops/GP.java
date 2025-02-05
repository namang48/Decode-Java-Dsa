package Loops;

import java.util.Scanner;

public class GP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        GP1(n);
        HW(n);
    }

    //2 4 8 16 32 64 128 .......
    static void GP1(int n) {
        System.out.println("GP1");
        int a = 2, r = 2;
        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            a *= r;
        }
    }

    static void HW(int n) {
        System.out.println("GP for HW");
        int a = 3, r = 4;
        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            a *= r;
        }
    }
}
