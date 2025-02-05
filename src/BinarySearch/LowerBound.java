package BinarySearch;

import java.util.Scanner;

public class LowerBound {
    private static void printArr(int[] arr) {
        for(int ele : arr){
            System.out.print(ele+"\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] arr = {1, 4, 6, 9, 12, 16, 18, 21, 32, 38, 56, 78, 98};
        printArr(arr);
        System.out.println("Enter number to find lower bound : ");
        int x=sc.nextInt();
        lowerBound(arr,x);
    }

    private static void lowerBound(int[] arr, int x) {
        int n=arr.length;
        int mid,lo=0,hi=n-1;
        int lowerBound=n;
        while(lo<=hi){
            mid=(lo+hi)/2;
            if(arr[mid]<x) lo=mid+1;
            else{
                hi = mid-1;
                lowerBound=Integer.min(mid,lowerBound);
            }
        }
        System.out.println("Lower Bound = "+lowerBound);
    }


}
