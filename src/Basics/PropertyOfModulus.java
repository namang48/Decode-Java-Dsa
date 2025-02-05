package Basics;

public class PropertyOfModulus {
    public static void main(String[] args) {
        System.out.println(37 % 10);
        System.out.println(7 % 10);         //a % b = a [ if a < b ]
        System.out.println(37 % -10);       //a % -b = a % b
        System.out.println(-37 % 10);       //-a % b = -(a % b)
        System.out.println(-37 % -10);      //-a % -b = -a % b = -[ a % b ]
    }
}
