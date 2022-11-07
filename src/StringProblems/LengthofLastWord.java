package StringProblems;
//Input: s = "Hello World"
//        Output: 5
//        Explanation: The last word is "World" with length 5.

import java.util.Scanner;

public class LengthofLastWord {
    public static int lengthOfLastWord(String s) {
        int len = 0;
        s = s.trim();
        for (int i = s.length() - 1; i >=0; i --){
            if (s.charAt(i) == ' '){
                break;
            }
            else{
                len ++;
            }
        }
        return len;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Emter string");
        String s=sc.nextLine();
        System.out.println(lengthOfLastWord(s));
    }

}
