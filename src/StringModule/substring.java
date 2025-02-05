package StringModule;

public class substring {
    public static void main(String[] args) {
        String s="abcde";

        //substring(<index>) return part of string starting from specified 'index'
        System.out.println(s.substring(2));

        //substring(<startIndex>,<endIndex>) return part of string starting from
        //'startIndex' upto 'endIndex' excluding endIndex character.
        System.out.println(s.substring(2,4));   //prints staring from 2 unto 3
        System.out.println(s.substring(2,2));   //prints nothing
        System.out.println(s.substring(2,3));   //prints staring from 2 unto 2
        //System.out.println(s.substring(0,6));   Out of bound error
        System.out.println(s.substring(0,5));   //valid although 5 is not the index


        //print all substring of a given string :
        printSubstrings(s);
    }
    static void printSubstrings(String a){
        System.out.println();
        for(int i=0 ; i<a.length();i++){
            for(int j=i+1;j<=a.length();j++){
                System.out.print(a.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}
