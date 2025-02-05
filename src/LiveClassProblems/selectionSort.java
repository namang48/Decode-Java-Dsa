package LiveClassProblems;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr={4,3,1,2,5};
        int n=arr.length;
        for(int ele : arr){
            System.out.print(ele + "\t ");
        }
        System.out.println();

        for(int i=0;i<n-1;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[minIndex]>arr[j])    minIndex=j;
            }
            //swap
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
        for(int ele : arr){
            System.out.print(ele + "\t ");
        }
    }
}
