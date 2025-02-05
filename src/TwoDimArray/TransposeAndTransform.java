package TwoDimArray;

import static TwoDimArray.DeclarationAndInitialisation.print;

public class TransposeAndTransform {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int m=arr.length;
        int n=arr[0].length;
        if(m==n){
            transform(arr);
        }else{
            System.out.println("Can't be transformed !");
        }

        print(arr);
    }
    public static void transform(int [][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
    }

}
