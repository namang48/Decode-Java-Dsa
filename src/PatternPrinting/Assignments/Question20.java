package PatternPrinting.Assignments;

public class Question20 {
    public static void main(String[] args) {
        int n=10;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*n-1;j++){
                if(i+j==n+1 || j==n|| j==n+i-1 || i==n)
                    System.out.print("*"+" ");
                else
                    System.out.print(" "+" ");
            }
            System.out.println();
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<=2*n-1;j++){
                if(i==j-1 || j==n || j==2*n-i-1)
                    System.out.print("*"+" ");
                else
                    System.out.print(" "+" ");
            }
            System.out.println();
        }
    }
}
