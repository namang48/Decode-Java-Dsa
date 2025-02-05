package StringModule.ImpQuestion;

public class MaxValueString {
    public static void main(String[] args) {
        String[] arr = {"01071", "0078", "0008", "00000099"};
        String maxS = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxS = max(maxS, arr[i]);
        }
        System.out.println("Max Value in array = " + maxS);
    }

    static String max(String a, String b) {
        String normalA = normal(a);
        String normalB = normal(b);
        String maxS = "";
        if (normalA.length() > normalB.length()) maxS = a;
        else if ((normalA.length() < normalB.length())) maxS = b;
        else {
            for (int i = 0; i < normalA.length(); i++) {
                char ch=normalA.charAt(i);
                char dh=normalB.charAt(i);
                if (ch!= dh){
                    if(ch>dh)   maxS=a;
                    else maxS=b;
                }
            }
        }
        return maxS;
    }

    static String normal(String s) {
        String normalS = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0') {
                normalS = s.substring(i, s.length());
                break;
            }
        }
        return normalS;
    }
}
