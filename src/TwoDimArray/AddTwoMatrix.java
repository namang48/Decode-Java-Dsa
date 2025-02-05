package TwoDimArray;
import static TwoDimArray.DeclarationAndInitialisation.print;

public class AddTwoMatrix {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int m1 = arr1.length;           //Rows
        int n1 = arr1[0].length;        //Columns

        int[][] arr2={{21,21,23,24},{25,26,27,28},{15,16,17,18}};
        int m2=arr2.length;
        int n2=arr2[0].length;

        int[][] res=new int[m1][n1];
        if(m1==m2 && n1==n2){
            res=addMatrix(arr1,arr2,res);
        }else{
            System.out.println("Order not matching !");
        }
        print(arr1);
        System.out.println("\t+");
        print(arr2);
        System.out.println("\t=");
        print(res);
    }
    public static int[][] addMatrix(int[][] a,int[][] b,int [][] temp){
        int m=a.length;
        int n=a[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n; j++) {
                temp[i][j]=a[i][j]+b[i][j];
            }
        }
        return temp;
    }
}
