package StringModule;

public class lowerUpperCase {
    public static void main(String[] args) {
        String x = "My Name Is NAMAN Kumar .";

        //toLowerCase() returns the given String in lower case
        System.out.println(x.toLowerCase() + "\n\n");

        //toUpperCase() returns the given String in Upper case
        System.out.println(x.toUpperCase() + "\n\n");


        //concat(<String>) returns concatenation of two string together, takes a string as input
        String firstNm = "Naman", lastNm = "Kumar";
        System.out.println(firstNm.concat(lastNm) + "\n");
        System.out.println(lastNm.concat(firstNm));

        //In java '+' is used as concatination operator with strings
        System.out.println(firstNm + lastNm);
        System.out.println(10 + " is even");
        System.out.println(10 + 10);       //with integers acts as addition operator


        //convert int to String
        int num = 10;
        String conv = 10 + "";
        //conv+=10;
        conv+= "th";
        System.out.println(conv);
        System.out.println(conv + 10);

        System.out.println(conv + 10 + 20);
        System.out.println(10 + 20 + conv);
    }
}
