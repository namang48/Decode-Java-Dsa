package BinarySearch;

import java.util.Scanner;

public class FirstAndLastPos {
    private static void printArr(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10,10,20,20,20,20,20,30,30,30,40,40};
        printArr(arr);
        System.out.println("Enter a number to get its first and last position : ");
        int x = sc.nextInt();
        firstLastPos(arr, x);
    }

    private static void firstLastPos(int[] arr, int x) {
        int n = arr.length;
        int fp = n, lp = n;

        int lo = 0, hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] >= x) {
                fp = Integer.min(fp, mid);
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        lp--;
        System.out.println("First Position = " + fp);
        System.out.println("Last Position  = " + lp);
    }
}
