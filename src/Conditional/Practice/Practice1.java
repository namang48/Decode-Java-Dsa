package Conditional.Practice;

public class Practice1 {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            for (int j = 2; j >= 0; j--) {
                if (i != j)
                    System.out.println("i= " + i + "\tj= " + j);
            }
        }
    }
}
