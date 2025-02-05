package ArrayAndArrayLists;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        //Linear Search in Arrays
        Scanner sc=new Scanner(System.in);

        int[] marks= {12,23,54,86,92,2,7,37,34,21,87,65,46,24,36,43,23,43,75,44};
        int n=marks.length;

        System.out.print("Enter the Number you want to search : ");
        int num=sc.nextInt();
        boolean flag=false;

        for( int i=0;i<n ; i++){
            if(num==marks[i]){
                System.out.println(num + " is at the index : " + i);
                flag=true;
                break;
            }
        }
        if(flag==false){
            System.out.println(num + " does not exist in the array !!");
        }
    }
}
