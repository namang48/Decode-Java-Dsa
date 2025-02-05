package ArrayAndArrayLists.Problems;

public class TwoSum {
    //Two sum Problem from LEETCODE
    //return index of both elements whose sum is EQUALS to a given target
    public static void main(String[] args) {
        int[] arr={ 2,4,5,6,8,12,95,23,65};
        int target=20;
        int[] res=findIndex(arr,target);
        System.out.println(res[0]+" "+res[1]);
    }

    public static int[] findIndex(int[] nums, int target) {
        int[] arr=new int[2];
        for (int i = 0; i < nums.length ; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                    break;
                }
            }
        }
        return arr;
    }
}
