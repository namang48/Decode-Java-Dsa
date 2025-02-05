package Conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) throws IOException {
        int num;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number :");
        num=Integer.parseInt(br.readLine());
        boolean even=(num%2==0);
        if(even){
            System.out.println(num + " is even.");
        }
        else{
            System.out.println(num + " is odd.");
        }
    }
}
