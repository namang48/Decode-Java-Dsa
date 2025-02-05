package StringModule.ImpQuestion;

import java.util.Scanner;

public class MaxOccurringCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s=sc.nextLine();

        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            int temp=(int)s.charAt(i)-97;
            arr[temp]++;
        }
        int maxFreq=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=maxFreq){
                maxFreq=arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==maxFreq){
                System.out.println("Max Occurring character : "+(char)(i+97));
            }

        }


    }
}
