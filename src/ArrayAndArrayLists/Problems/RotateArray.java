package ArrayAndArrayLists.Problems;

import ArrayAndArrayLists.ReverseArray;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Using Extra array
        int[] arr = {12, 32, 43, 12, 45, 65, 76, 87, 34, 65, 76, 34};
        int n = arr.length;

        ReverseArray ob = new ReverseArray();
        ob.printArray(arr);

        System.out.println("Enter k : ");
        int k = sc.nextInt();

        arr = rotateArray(arr, k);

        System.out.println("After rotating : ");
        ob.printArray(arr);

    }

    private static int[] rotateArray(int[] a, int k) {
        int n=a.length;
        int[] temp=new int[n];
        for (int i = n-k,j=0; i < n; i++,j++) {
            temp[j]=a[i];
        }
        for(int i=0; i<n-k;i++){
            temp[k+i]=a[i];
        }
        return temp;
    }
}