package ArrayAndArrayLists.Problems;

import static ArrayAndArrayLists.ReverseArray.swap;

public class SortZeroOneTwo {
    public static void main(String[] args) {
        //Sorting Using Dutch FLag Algorithm
        int[] arr={0,1,1,0,2,0,1,0,1,0,2,1,0,2,0,2,0,1,2,0,1,2,0,1};
        for(int ele : arr){
            System.out.print(ele +" ");
        }
        System.out.println();

        sortColors(arr);
        System.out.println("After Sorting : ->");
        for(int ele : arr){
            System.out.print(ele +" ");
        }
        System.out.println();
    }

    public static void sortColors(int[] a) {
        int n= a.length;
        int low=0,mid=0,hi=n-1;
        while(mid<hi){
            if(a[mid]==0){
                swap(a,low,mid);
                low++;  mid++;
            }else if(a[mid]==1){
                mid++;
            }else{
                swap(a,mid,hi);
                hi--;
            }
        }
    }
}
