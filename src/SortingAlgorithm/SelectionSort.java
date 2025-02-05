package SortingAlgorithm;

public class SelectionSort {
    static void printArr(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + "\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1, 34, 54, 23, 78, 65, 43, 44, 12};
        printArr(arr);
        selectionSort(arr);
    }
    static void selectionSort(int[] arr){
        int n=arr.length;

        for(int i=0 ; i<n-1;i++){
            int minIndex=i;
            for(int j=i;j<n;j++){
                //finding minimum element's index
                if(arr[j]<arr[minIndex])   minIndex=j;

            }
            //place the element to its right place.
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
            System.out.print("Pass "+(i+1)+":\t");
            printArr(arr);
        }
        //avg time complexity-O(n^2)
        //worst case time complexity- O(n^2)
        //best case time complexity- O(n^2)
    }
}
