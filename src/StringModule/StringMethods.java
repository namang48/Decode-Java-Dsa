package StringModule;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Naman Kumar";
        int size = str.length();
        //length() method return the size of the string
        System.out.println("Size of String : " + size);


        System.out.println("Character at Index 0 : " + str.charAt(0));
        //charAt(<index>) return the value at the specified index in the string

        System.out.println("Index of 'K' in the String is : " + str.indexOf('K'));
        //returns the first occurring index of the specified character
        //if character is absent then returns -1

        System.out.println("Last Occurring Index of 'a' is : "+ str.lastIndexOf('a'));
        //returns the last occurring index of specified character


        String a="abc";
        String b="dbc";
        System.out.println("Differance : "+ a.compareTo(b));
        //compareTo() compares two string lexicographically
        //it returns the difference of ASCII value of first occurring different characters
        //if string is same than it returns 0
        //if length is not same then it returns the difference in length if all characters are same
    }
}
