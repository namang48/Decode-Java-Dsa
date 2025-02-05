package ArrayAndArrayLists.Problems;

public class SortZeroAndOne {
    public static void main(String[] args) {
        //In one pass using 2 pointers
        int[] arr={0,1,0,1,1,0,0,1,0,1,1,1,0,0,1,0,1};
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        sortZeroAndOne(arr);
        System.out.println("<-:  AFTER SORTING  :->");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void sortZeroAndOne(int[] a) {
        int n= a.length;
        for(int i=0,j=n-1; i<j;){
            if(a[i]==0) i++;
            else if(a[j]==1) j--;
            else if(a[i]==1 && a[j]==0){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;j--;
            }
        }
    }
}
