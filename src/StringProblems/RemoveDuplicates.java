package StringProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();

            Solution1 ob = new Solution1();
            String result = ob.removeDups(s);

            System.out.println(result);
        }
    }
}


class Solution1 {
    public static String removeDups(String S) {
        //Create LinkedHashSet of type character
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        String re="";

        //Add each character of the string into LinkedHashSet
        for(int i=0;i<S.length();i++)
            set.add(S.charAt(i));


        for(Character ch : set)
        {re=re+ch;}

        return re;
    }
}
