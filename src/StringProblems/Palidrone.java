package StringProblems;
//Problem statement: Check String is palidrone or not

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palidrone {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}


//User function Template for Java

class Solution {
    int isPalindrome(String S) {

        String sa = "";
        for (int i = S.length() - 1; i >= 0; i--) {
            sa = sa + S.charAt(i);
        }

        if (sa.equals(S)) return 1;
        return 0;
        // code here
    }
};
