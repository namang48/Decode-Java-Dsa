package BinarySearch;

import java.util.Scanner;

public class BinarySearch {
    //it is a technique which is used to search element in a sorted array.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] arr = {1, 4, 6, 9, 12, 16, 18, 21, 32, 38, 56, 78, 98};
        System.out.println("Please enter target : ");
        int target=sc.nextInt();


        //Binary Search Algorithm
        boolean flag=false; //false means not available in array
        int lo = 0, hi = arr.length - 1, mid = 0;
        while (lo <= hi) {
            mid=(lo+hi)/2;
            if(arr[mid]>target){
                hi=mid-1;
            }else if(arr[mid]<target){
                lo=mid+1;
            }else if(arr[mid]==target){
                flag=true;      //true means target is found32
                break;
            }
        }
        if(flag){
            System.out.println("Target found !");
        }else{
            System.out.println("Target not found !");
        }
    }
}
