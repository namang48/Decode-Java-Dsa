package ArrayAndArrayLists;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={12,32,43,12,45,65,76,87,34,65,76,34};
        int n=arr.length;

        printArray(arr);            //function created to print array


        System.out.println("<- After Reversing Array ->");
        reverseArray(arr);          //function created to reverse array
        printArray(arr);


        System.out.println("<- After Partial Reversing Array ->");
        partialReverse(arr,2,7);
        printArray(arr);
    }

    private static void reverseArray(int[] a) {
        int n=a.length;
        int mid=n/2-1;
        for(int i=0,j=n-1;i<=mid;i++,j--){
            swap(a,i,j);            //function created to swap value inside an array
        }
    }
    public static void printArray(int[] a){
      for(int i=0;i<a.length;i++){
          System.out.print(a[i]+"\t");
      }
        System.out.println();
    }
    public static void swap(int[] a,int i,int j){
        a[i]=a[i]+a[j];
        a[j]=a[i]-a[j];
        a[i]=a[i]-a[j];
    }
    public static void partialReverse(int[] a, int firstIndex, int lastIndex){
        while(firstIndex < lastIndex){
            swap(a,firstIndex,lastIndex);
            firstIndex++;
            lastIndex--;
        }
    }
}
