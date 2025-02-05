package StringModule.StringBuilderJava;

public class AppendMethod {
    public static void main(String[] args) {
        //used to add any datatype at the end of a StringBuilder Object
        StringBuilder s=new StringBuilder("ABC");
        s.append(35);
        System.out.println(s);

        s.append('*');
        System.out.println(s);

        s.append(30.109);
        System.out.println(s);

        char[] str={'P','C','M'};
        s.append(str);
        System.out.println(s);

        /*
        int[] arr={1,4,2};
        s.append(arr);
        System.out.println(s);  //Doesn't work as address of array gets appended
        We can add each element using loop in array .
        */

        String st="Naman";
        s.append(st);
        System.out.println(s);

        StringBuilder sb=new StringBuilder("Last");
        s.append(sb);
        System.out.println(s);

    }
}
