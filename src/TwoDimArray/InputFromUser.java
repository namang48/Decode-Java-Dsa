package TwoDimArray;

import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][4];        //array Literals
        int rows = arr.length;
        int cols = arr[0].length;

        print(arr);
        System.out.println("Order = " + rows + " x " + cols);

        //Taking input from user
        //int a = 1;
        System.out.println("Enter Elements : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                //System.out.print("Enter element " + a++ + " : ");
                arr[i][j] = sc.nextInt();
            }
        }
        print(arr);
    }

    public static void print(int[][] arr) {
        System.out.println();
        for (int[] ele : arr) {
            for (int x : ele) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
