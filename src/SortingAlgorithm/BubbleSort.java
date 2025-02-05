package SortingAlgorithm;

public class BubbleSort {
    static void printArr(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 34, 54, 23, 78, 65, 43, 44, 12};
        printArr(arr);
        bubbleSort(arr);
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.print("Pass " + (i + 1)+":\t");
            printArr(arr);
        }
        //time complexity - O(n^2)
    }
}
