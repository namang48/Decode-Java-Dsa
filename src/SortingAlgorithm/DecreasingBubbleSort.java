package SortingAlgorithm;

public class DecreasingBubbleSort {
    static void printArr(int [] arr){
        for(int ele : arr){
            System.out.print(ele +"\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 34, 54, 23, 78, 65, 43, 44, 12};
        printArr(arr);
        decreasingBubbleSort(arr);
        printArr(arr);
    }
    public static void decreasingBubbleSort(int[] arr){
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            boolean flag=true;
            for(int j=0;j<n-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=false;
                }
            }
            if(flag)    break;
        }
    }
}
