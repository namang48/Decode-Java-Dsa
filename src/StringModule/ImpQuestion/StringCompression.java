package StringModule.ImpQuestion;

public class StringCompression {
    public static void main(String[] args) {
        //Leetcode 443

        String s="aaabbbbcccbsssbbeefgh";
        char[] arr=s.toCharArray();
        String ans="";

        int i=0,j=0;
        while(j<arr.length){
            if(arr[i]==arr[j])  j++;
            else{
                ans+=arr[i];
                int len=j-i;
                if(len>1)   ans+=len;
                i=j;
            }
        }
        ans+=arr[i];
        int len=j-i;
        if(len>1)   ans+=len;
        System.out.println(ans);


        //Extra code for Leetcode -443
//        for(i=0;i<ans.length();i++){
//            arr[i]=ans.charAt(i);
//        }
//        return ans.length

    }
}
