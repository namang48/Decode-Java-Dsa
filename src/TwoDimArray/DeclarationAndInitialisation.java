package TwoDimArray;

public class DeclarationAndInitialisation {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];        //Dynamically allocated
        int[][] b={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};         //array Literals
        print(arr);
        print(b);
    }

    public static void print(int[][] arr) {
        for (int[] ele : arr) {
            for (int x : ele) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
