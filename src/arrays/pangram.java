package arrays;

import java.util.Scanner;

public class pangram {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String sentence = in.next();
        boolean ans = checkIfPangram(sentence);
        System.out.println(ans);
    }

    static boolean checkIfPangram(String sentence) {
        boolean[] ans = new boolean[26];
        for (int i = 0; i < ans.length; i++)
            ans[i] = false;
        boolean flag = true;
        for (int i = 0; i < sentence.length(); i++) {
            int val = sentence.charAt(i) - 97;
            ans[val] = true;
        }
        for (int i = 0; i < ans.length; i++) {
            if (ans[i] == false) {
                flag = false;
            }
        }
        return flag;
    }
}