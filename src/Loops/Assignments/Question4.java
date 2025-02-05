package Loops.Assignments;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check for palindrome : ");
        String s = sc.next();
        int flag = 0, j = s.length() - 1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(j)) {
                System.out.println(s + " is not palindrome !");
                flag++;
                break;
            }
            j--;
        }
        if (flag == 0) {
            System.out.println(s + " is palindrome");
        }
    }
}
