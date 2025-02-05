package StringModule.StringBuilderJava;

public class capacityLength {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("ABC");

        System.out.println(s.length());
        System.out.println(s.capacity());
        System.out.println(s.capacity()-s.length());
    }
}
