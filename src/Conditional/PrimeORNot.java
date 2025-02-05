package Conditional;

import java.util.Scanner;

public class PrimeORNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter unto how much you want to get Prime numbers :");
        int num=sc.nextInt();
        byte flag;
        for (int i = 2; i < num; i++) {
            flag = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                System.out.print(i + "\t");
        }
    }
}
