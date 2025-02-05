package TwoDimArray;
import static TwoDimArray.DeclarationAndInitialisation.print;

public class SumOfAllElements {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int m = arr.length;           //Rows
        int n = arr[0].length;        //Columns

        print(arr);
        //Adding elements
        int sum=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum+=arr[i][j];
            }
        }
        System.out.println("Sum of all Elements = "+ sum);
    }
}
