package RAJA;

import java.util.Scanner;
import java.util.Stack;

public class ReverseWordOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sen = sc.nextLine();
        String sub = "";

        Stack<String> stk = new Stack<>();

        for (int i = 0; i < sen.length(); i++) {

            if (sen.charAt(i) == ' ') {
                stk.add(sub);

                sub = "";
            } else {
                sub = sub + sen.charAt(i);
            }
        }
        stk.add(sub);


        while (!stk.empty()) {
            sub = stk.peek();
            System.out.print(sub + " ");
            stk.pop();
        }
    }
}
