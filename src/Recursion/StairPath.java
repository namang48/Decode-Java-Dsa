package Recursion;

public class StairPath {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("No of ways to reach : " + stair(n));
    }
    //Can only take either 1 stair jump or 2 stair jump at a time
    public static int stair(int n) {
        if (n == 1 || n == 2) return n;
        return stair(n - 1) + stair(n - 2);
    }
}
