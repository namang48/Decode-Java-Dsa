package TwoDimArray.PrintingForms;

public class SpiralMatrix2 {
    public int[][] generateMatrix(int n) {
        int[][] arr=new int[n][n];
        int count=1;
        int minc=0,maxc=n-1;
        int minr=0,maxr=n-1;
        while(minc<=maxc && minr<=maxr){
            //left to right
            for(int i=minc ; i<=maxc ; i++){
                arr[minr][i]=count++;
            }
            minr++;
            //top to bottom
            for(int i=minr ; i<=maxr ; i++){
                arr[i][maxc]=count++;
            }
            maxc--;
            //right to left
            for(int i=maxc ; i>=minc ; i--){
                arr[maxr][i]=count++;
            }
            maxr--;
            //bottom to top
            for(int i=maxr ; i>=minr ; i--){
                arr[i][minc]=count++;
            }
            minc++;

        }
        return arr;
    }
}

