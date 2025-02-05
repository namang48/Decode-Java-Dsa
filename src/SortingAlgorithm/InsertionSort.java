package SortingAlgorithm;

public class InsertionSort {
    static void printArr(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 34, 54, 23, 78, 65, 43, 44, 12};
        printArr(arr);
        insertionSort(arr);
        printArr(arr);
    }

    static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            for(int j=i;j>=1;j--){
               if(arr[j]<arr[j-1]){
                   int temp=arr[j];
                   arr[j]=arr[j-1];
                   arr[j-1]=temp;
               }else{
                   break;
               }
            }
        }
        //avg case time complexity -O(n^2)
        //worst case time complexity -O(n^2)
        //best case time complexity -O(n)
    }

//    static void insertionSort(int[] arr) {
//        int n = arr.length;
//
//        for (int i = 1; i < n; i++) {
//            int index=i,temp=arr[i];
//            for(int j=i-1;j>=0;j--){
//                if(arr[j]>arr[i]){
//                    index=j;
//                }
//            }
//            for(int j=i-1;j>=index;j--){
//                arr[j+1]=arr[j];
//            }
//            arr[index]=temp;
//        }
//    }
}
