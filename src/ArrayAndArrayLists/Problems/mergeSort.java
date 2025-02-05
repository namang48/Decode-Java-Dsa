package ArrayAndArrayLists.Problems;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 3, 5, 12, 26, 32, 32, 37, 45, 47, 75, 78};
        int[] arr2 = {12, 13, 21, 23, 67, 96};

        //Merging two sorted array in third array

        int[] ans = mergeSort(arr1, arr2);

        for (int ele : ans) {
            System.out.print(ele + " ");
        }
    }

    /* //function to sort an array
     static void sort(int[] a){
         int max=Integer.MIN_VALUE;
         for(int i=0;i<a.length-1;i++){
             for(int j=i+1;j<a.length;j++){
                 if(a[i]>a[j]){
                     swap(a,i,j);
                 }
             }
         }
     }*/
    //function to merge two sorted array
    static int[] mergeSort(int[] a, int[] b) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] c = new int[a.length + b.length];

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }
        if (i == a.length) {
            while (j < b.length) {
                c[k++] = b[j++];
            }
        }
        if (j == b.length) {
            while (i < a.length) {
                c[k++] = a[i++];
            }
        }

        return c;
    }

}
