package StringModule.StringBuilderJava;

import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        //reverse() reverses the StringBuilder object
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string : ");
        StringBuilder sb=new StringBuilder(sc.nextLine());
        int m=sb.length();
        //StringBuilder rev=new StringBuilder(m);
        int i=0,j=0;
        while(i<m && j<m){
            char ch=sb.charAt(j);
            if(ch ==' ' || ch=='.'){
                revPart(sb,i,j-1);
                i=j+1;
            }
            j++;
        }
        System.out.println("Reversed String : \n"+ sb);

    }

    static void revPart(StringBuilder s,int start,int end){
        while( start < end ){
            char temp=s.charAt(start);
            s.setCharAt(start,s.charAt(end));
            s.setCharAt(end,temp);
            start++;
            end--;
        }
    }
}
