package TwoDimArray;

public class ScoreAfterFlipMatrix {
    public static void main(String[] args) {
        //leetcode 861

    }
}
class Solution {
    public int matrixScore(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            if (grid[i][0] == 0) {  //flip the row
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 0) grid[i][j] = 1;
                    else grid[i][j] = 0;
                }
            }
        }
        for (int j = 1; j < n; j++) {
            int noOfZero=0,noOfOnes=0;
            for(int i=0;i<m ; i++){
                if(grid[i][j]==0) noOfZero++;
                else noOfOnes++;
            }
            if (noOfZero>noOfOnes) {  //flip the column
                for (int i = 0; i < m; i++) {
                    if (grid[i][j] == 0) grid[i][j] = 1;
                    else grid[i][j] = 0;
                }
            }
        }
        int score=0;
        for(int i=0;i<m;i++){
            int temp=1;
            for(int j=n-1;j>=0 ; j-- ){
                score+=grid[i][j]*temp;
                temp*=2;
            }
        }
        return score;
    }
}
