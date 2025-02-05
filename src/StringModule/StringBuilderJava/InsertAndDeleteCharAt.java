package StringModule.StringBuilderJava;

public class InsertAndDeleteCharAt {
    public static void main(String[] args) {
        //deleteCharAt(<index>) removes character from specified index in StringBuilder class.
        StringBuilder s = new StringBuilder("Namaan Kumar");
        System.out.println("Original String : " + s);

        //removing 'a' from index 3
        s.deleteCharAt(3);
        System.out.println("\nAfter Removing character from index 3 :");
        System.out.println(s);

        //delete(<start>,<end>) removes a substring whose starting Index is <start> and
        //last index is <end-1>;

        s.delete(3, 7);      //removes character from index 3 to 6.
        System.out.println("\nAfter Removing character from index 3 to 6 :");
        System.out.println(s);


        //insert(<index>,<data>) insert given 'data' at a specified index.
        StringBuilder str = new StringBuilder("Physcs Wallah");
        System.out.println("\n\nOriginal String : " + str);

        //inserting 'i' at index 4
        str.insert(4, "1234");     //it works with all datatype like append() does !
        System.out.println("\nAfter Inserting character 'i' at index 3 :");
        System.out.println(str);
    }
}
