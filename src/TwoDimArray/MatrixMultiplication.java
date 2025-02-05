package TwoDimArray;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 1}, {2, 1, 2}};
        int[][] b = {{1, 0, 1, 2}, {2, 1, 0, 0}, {0, 3, 1, 1}};
        int[][] res = mulMatrix(a, b);
        for (int[] ele : res) {
            for (int x : ele) {
                System.out.print(x + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] mulMatrix(int[][] a, int[][] b) {
        int[][] c = new int[a.length][b[0].length];
        if (a[0].length == b.length) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b[0].length; j++) {
                    int sum = 0;
                    for (int k = 0; k < b.length; k++)
                        sum += a[i][k] * b[k][j];
                    c[i][j] = sum;
                }
            }
        } else
            System.out.println("Can't Multiply because of order mismatch !");
        return c;
    }
}
