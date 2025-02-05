package Loops;

public class Practice1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            boolean divBy5 = i % 5 == 0;
            boolean divBy3 = i % 3 == 0;
            if(divBy3 || divBy5){
                System.out.println(i);
            }
        }
    }
}
