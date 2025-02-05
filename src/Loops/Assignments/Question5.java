package Loops.Assignments;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        //fibonacci series of n terms
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms : ");
        int n = sc.nextInt();
        int term1 = 0, term2 = 1;
        System.out.print(term1 + "\t");
        System.out.print(term2 + "\t");

        for (int i = 1; i < n - 1; i++) {
            int nextTerm = term1 + term2;
            System.out.print(nextTerm + "\t");
            term1=term2;
            term2=nextTerm;

        }
    }
}
