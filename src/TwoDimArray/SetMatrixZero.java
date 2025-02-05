package TwoDimArray;

public class SetMatrixZero {
    public static void main(String[] args) {
        //Leetcode 73

    }
}
class SetZeroes {
    public void setZeroes(int[][] matrix) {
        int n= matrix.length;
        int m= matrix[0].length;

        Boolean firstRow=false;
        Boolean firstCol=false;



        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    if(j==0){
                        firstCol=true;
                    }
                    if(i==0){
                        firstRow=true;
                    }
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }



        if(firstCol){
            for(int i=0;i<n;i++){
                matrix[i][0]=0;
            }
        }
        if(firstRow){
            for(int i=0;i<m;i++){
                matrix[0][i]=0;
            }
        }
    }
}
