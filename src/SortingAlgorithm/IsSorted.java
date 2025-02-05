package SortingAlgorithm;

public class IsSorted {
    public static void main(String[] args) {
        int[] arr = {1, 34, 54, 23, 78, 65, 43, 44, 12};
        isSorted(arr);
    }

    static void isSorted(int[] arr) {
        int n = arr.length;
        boolean flag = true;
        for (int i = 0; i < n - 1; i++) {
            if(arr[i]>arr[i+1]){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("Sorted .");
        }else{
            System.out.println("Unsorted .");
        }
    }
}
