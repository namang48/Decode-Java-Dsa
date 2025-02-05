package LeetcodeProblems;

public class mergeTwoSortedArray {
    public static void main(String[] args) {
        mergeTwoSortedArray ob=new mergeTwoSortedArray();
        int[] arr1 = {1, 3, 3, 5, 12, 26, 32, 0, 0, 0, 0, 0, 0};
        int[] arr2 = {12, 13, 21, 23, 67, 96};

        //sorting elements by merging method
        ob.solution(arr1,sizeof(arr1),arr2,sizeof(arr2));
        for(int ele : arr1){
            System.out.print(ele+" ");
        }
    }


    //solution for the question
    void solution(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }

    //size finding of array when 0 is excluded.
    static int sizeof(int[] a){
        int count=0;
        for(int ele : a){
            if(ele == 0){
                break;
            }
            count++;
        }
        return count;
    }
}
