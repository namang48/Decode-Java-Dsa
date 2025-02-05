package StringModule;

public class equalsMethod {
    public static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = "abcdef";         //abcdef exists in the RAM.
        // So s1 and s2 are pointing to the same string
        System.out.println(s1 == s2);      //here address stored in s1 and s2 is compared.

        s1 = "abcxyz";
        s2 = "abc";
        s2 += "xyz";
        System.out.println(s1 + "\n" + s2);
        System.out.println("Using == operator : " + (s1 == s2));         //although both string are equal , it returns false

        System.out.println("Using equals() method : " + s1.equals(s2));  //equals() return boolean value whether
        //both string are equal or not.

    }
}
