package SortingAlgorithm;

public class OptimisedBubbleSort {
    static void printArr(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 12,23, 34, 54, 23, 78, 65, 43, 44};
        printArr(arr);
        optimisedBubbleSort(arr);

    }

    static void optimisedBubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;
                }
            }
            System.out.print("Pass " + (i + 1) + ":\t");
            printArr(arr);
            if (flag) break;
        }
        //time complexity - O(n^2)
    }
}
