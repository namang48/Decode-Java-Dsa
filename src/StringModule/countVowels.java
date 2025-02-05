package StringModule;

import java.util.Scanner;

public class countVowels {
    public static void main(String[] args) {
        System.out.println("Enter A string : ");
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();

        //Counting the vowels
        int count=0;
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i)))    count++;
        }
        System.out.println("No of vowels = "+ count);
    }
    static boolean isVowel(char ch){
        if(ch=='a' || ch=='A') return true;
        if(ch=='e' || ch=='E') return true;
        if(ch=='i' || ch=='I') return true;
        if(ch=='o' || ch=='O') return true;
        if(ch=='u' || ch=='U') return true;
        return false;
    }
}
