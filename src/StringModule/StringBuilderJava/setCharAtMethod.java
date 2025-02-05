package StringModule.StringBuilderJava;

public class setCharAtMethod {
    public static void main(String[] args) {
        //setCharAt(<index>,<character>) replace character at specified
                                    // index with given character
                                    //in StringBuilder class
        //Example :
        StringBuilder sb=new StringBuilder("Nadan Kumar");
        System.out.println(sb);
        sb.setCharAt(2,'m');
        System.out.println("After changing character at index 2 with \'m\' :");
        System.out.println(sb);

    }
}

