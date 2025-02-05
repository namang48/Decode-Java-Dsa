package TwoDimArray;

public class WaveFormPrinting {
    public static void main(String[] args) {
        //myMethod();
        int[][] arr = {{1, 2, 3, 18}, {4, 5, 25, 6}, {7, 8, 25, 9}};
        int m = arr.length;
        int n = arr[0].length;

        //Wave Form Printing
        //for Even index row elements are printed straight
        //for Odd Index row elements are printed reversed

        for (int i = 0; i < m; i++) {
            if(i%2==0){
                for (int j = 0; j <n; j++) {
                    System.out.print(arr[i][j]+"\t");
                }
            }else{
                for (int j = n-1; j >=0; j--) {
                    System.out.print(arr[i][j]+"\t");
                }
            }

        }
    }

    public static void myMethod() {
        int[][] arr = {{1, 2, 3, 18}, {4, 5, 25, 6}, {7, 8, 25, 9}};
        int m = arr.length;
        int n = arr[0].length;

        //Printing in WAVE FORM
        int j = 0;
        for (int i = 0; i < m; i++) {
            if (j == 0) {
                while (j < n) {
                    System.out.print(arr[i][j++] + "\t");
                }
            } else if (j == n) {
                while (j > 0) {
                    System.out.print(arr[i][--j] + "\t");
                }
            }
            //System.out.println();
        }
    }
}
