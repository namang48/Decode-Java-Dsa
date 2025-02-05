package TwoDimArray;

public class SearchInMatrix {
    public static void main(String[] args) {
        //Leet code-240

    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        boolean flag=false;
        int i=0,j=n-1;;
        while(i<m && j>=0){
            if(matrix[i][j]<target){
                //If element is smaller, move to next row
                i++;
            }else if(matrix[i][j]>target){
                //If element is larger, move to previous column
                j--;
            }else if(matrix[i][j]==target){
                flag=true;
                break;
            }
        }
        return flag;
    }
}
