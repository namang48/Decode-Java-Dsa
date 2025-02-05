package Recursion;

public class HWStairJump {
    public static void main(String[] args) {
        int n=5;
        System.out.println("No of ways to climb : "+stair(n));
    }

    public static int stair(int n) {
        if(n==1 || n==2 )   return n;
        if(n==3)    return 4;
        return stair(n-1)+stair(n-2); 
    }
}
