package StringModule.StringBuilderJava;
import java.util.Arrays;

public class sortingString {
    //we can reverse a string by converting it into character array.
    public static void main(String[] args) {
        String s="NamanKumar";

        //toCharArray() converts string into character array and return reference of it.
        char[] arr=s.toCharArray();
        for(char ele : arr){
            System.out.print(ele);
        }
        System.out.println();

        //sorting the array using builtIn Array.sort() method.
        Arrays.sort(arr);
        for(char ele : arr){
            System.out.print(ele);
        }

    }
}
