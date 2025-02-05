package PatternPrinting.Assignments;

public class Question16 {
    public static void main(String[] args) {
        int n=7;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*n-1;j++){
                if(i==j || i+j==2*n) System.out.print("*"+" ");
                else     System.out.print(" "+" ");
            }
            System.out.println();
        }
    }
}
