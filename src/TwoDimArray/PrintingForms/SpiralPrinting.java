package TwoDimArray.PrintingForms;

public class SpiralPrinting {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                //{11, 12, 13, 14, 15},
                //{16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}};
        int m = arr.length, n = arr[0].length;
        int minr = 0, maxr = m - 1;
        int minc = 0, maxc = n - 1;

        while (minr <= maxr && minc<=maxc) {
            //left top -> right top
            for (int i = minc; i <= maxc; i++) {
                System.out.print(arr[minr][i] + "\t");
            }
            minr++;
            if( minr>maxr || minc > maxc)
                break;

            //right top -> right bottom
            for (int i = minr; i <= maxr; i++) {
                System.out.print(arr[i][maxc] + "\t");
            }
            maxc--;
            if( minr>maxr || minc > maxc)
                break;

            //right bottom -> left bottom
            for (int i = maxc; i >= minc; i--) {
                System.out.print(arr[maxr][i] + "\t");
            }
            maxr--;
            if( minr>maxr || minc > maxc)
                break;

            //left bottom -> left top
            for (int i = maxr; i >= minr; i--) {
                System.out.print(arr[i][minc] + "\t");
            }
            minc++;
            System.out.println();
        }
    }
}
