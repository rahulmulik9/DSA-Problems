package StringProblems;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public static boolean checkPar(String s) {
        char arr[] = s.toCharArray();
        Stack<Character> set = new Stack();
        for (Character ch : arr) {
            if (ch == '{' || ch == '[' || ch == '(') {
                set.push(ch);
            } else if (ch == ']') {
                if (set.isEmpty() || set.peek() != '[') {
                    return false;
                }
                set.pop();
            } else if (ch == ')') {
                if (set.isEmpty() ||  set.peek() != '(')
                    return false;
                set.pop();
            } else if (ch == '}') {
                if (set.isEmpty() ||  set.peek() != '{')
                    return false;
                set.pop();
            }
        }
        return set.size() == 0;
    }


    public static void main(String[] args) {
        String str = "{({})}";
        if (checkPar(str)) {
            System.out.println("Blanced");
        }else {
            System.out.println("Unbalanced");
        }

    }
}
