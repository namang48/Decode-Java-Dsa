package TwoDimArray;

import static TwoDimArray.DeclarationAndInitialisation.print;

public class RotateMatrix90Degree {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int m=arr.length;
        int n=arr[0].length;

        print(arr);

        //Rotate -> Transpose + Reverse Each Row
        //Step1 -> Transpose;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        //Step2 -> Reverse ech row of the matrix
        for (int i = 0; i < m; i++) {
            int a=0,b=m-1;
            while(a<b){
                int temp=arr[i][a];
                arr[i][a]=arr[i][b];
                arr[i][b]=temp;
                a++;
                b--;
            }
        }
        System.out.println("Rotated Matrix By 90° Clockwise");
        print(arr);
    }
}
