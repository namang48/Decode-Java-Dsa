package Recursion;

public class NthFibonacciTerm {
    public static void main(String[] args) {
        int n=9;
        System.out.println("Answer : "+fibonacciTerm(n));

    }
    public static int fibonacciTerm(int n){
        if(n==0 || n==1)    return n;

        //term n is equal to sum of previous term and previous of previous term
        int ans=fibonacciTerm(n-1)+fibonacciTerm(n-2);
        return ans;
    }
}
