package Conditional.Practice;

public class Practice3 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        if (s1 == s2) System.out.println(1);        //using equality operator
        else System.out.println(2);

        if (s1.equals(s2))
            System.out.println(3);   //using method
        else
            System.out.println(4);
    }
}
