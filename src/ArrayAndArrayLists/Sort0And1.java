package ArrayAndArrayLists;

public class Sort0And1 {
    public static void main(String[] args) {
        int[] arr={0,1,0,1,1,0,0,1,0,1,1,1,0,0,1,0,1};
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        sort0and1(arr);
        System.out.println("After Sorting : ->");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }

    public static void sort0and1(int[] a) {
        int count=0;
        for (int ele: a) {
            if(ele ==0) count++;
        }
        for(int i=0;i<count;i++){
            a[i]=0;
        }
        for(int i=count;i<a.length;i++){
            a[i]=1;
        }
    }
}
