package Loops;

public class Print1to100 {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            System.out.print(i + "\t");
            if(i%5==0)
                System.out.println();
        }
    }
}
