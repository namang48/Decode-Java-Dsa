package StringModule.StringBuilderJava;

public class ToggleChar {
    public static void main(String[] args) {
        // change upper case to lower casec characters and lower case to upper case characters
        StringBuilder sbr=new StringBuilder("nAmaN KuMAr");
        System.out.println("Given String : "+sbr);

        for(int i=0;i<sbr.length();i++){
            char ch=sbr.charAt(i);
            if(ch>=65 && ch<=90)    ch+=32;
            else if(ch>=97 && ch<=122)  ch-=32;
            sbr.setCharAt(i,ch);
        }
        System.out.println("Toggled String : "+sbr);

    }
}
