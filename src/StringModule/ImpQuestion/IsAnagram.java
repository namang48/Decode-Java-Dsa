package StringModule.ImpQuestion;

import java.util.Arrays;

public class IsAnagram {
    //An Anagram is a word or phrase formed by rearranging the
    // letters of a different word or phrase, typically
    // using all the original letters exactly once.
    public static void main(String[] args) {
        String s = "nagaram", t = "magaran";
        boolean isAnagram = validAnagram(s, t);

        if (isAnagram==true) System.out.println(s + " and " + t + " are anagrams.");
        else System.out.println(s + " and " + t + " are not anagrams.");
    }

    static boolean validAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        char[] x = a.toCharArray();
        char[] y = b.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        System.out.println();

        for (int i = 0; i < a.length(); i++) {
            if (x[i] != y[i])
                return false;
        }
        return true;
    }
}
