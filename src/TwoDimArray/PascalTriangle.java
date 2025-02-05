package TwoDimArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter n : ");
        int n=5;//sc.nextInt();

        List<List<Integer>> ans=pascalTriangle(n);
        for(int i=0;i<ans.size();i++){
            for(int j=0;j<ans.get(i).size();j++){
                System.out.print(ans.get(i).get(j)+"\t");
            }
            System.out.println();
        }
    }
    static List<List<Integer>> pascalTriangle(int n){
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> temp=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    temp.add(1);
                }else{
                    int sum=l.get(i-1).get(j)+l.get(i-1).get(j-1);
                    temp.add(sum);
                }
            }
            l.add(temp);
        }
        //method 2
        /*for(int i=2;i<l.size();i++){
            for(int j=1;j<l.get(i).size()-1;j++){
                int sum=l.get(i-1).get(j)+l.get(i-1).get(j-1);
                l.get(i).set(j,sum);
            }
        }*/
        return l;
    }
}
