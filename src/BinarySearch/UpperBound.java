package BinarySearch;

import java.util.Scanner;

public class UpperBound {
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
        System.out.println("Enter number to find Upper bound : ");
        int x=sc.nextInt();
        upperBound(arr,x);
    }

    private static void upperBound(int[] arr, int x) {
        int n=arr.length;
        int mid,lo=0,hi=n-1;
        int upperBound=n;
        while(lo<=hi){
            mid=(lo+hi)/2;
            if(arr[mid]<=x) lo=mid+1;
            else{
                hi = mid-1;
                upperBound=Integer.min(mid,upperBound);
            }
        }
        System.out.println("Upper Bound = "+upperBound);
    }
}
