package RAJA;

import java.util.Stack;
import java.util.*;

//We create char array from given inputs
//then we in brackets are opening then we placed to stack
//if any closed bracket come then we pop bracket from stack and checck that whether that is right closing bracket or not
//if it is right closing bracket then return true or return false
public class Prob1 {
    public static boolean balancPar(String str) {

        // create an empty stack
        Stack stack = new Stack();

        // convert inputStr to char array
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            char current = arr[i];

            //check for bracket is opeining type or not
            //if yes then add to stack
            if (current == '{' || current == '[' || current == '(') {
                stack.push(current);
                continue;
            }
            //condition if stack is empty
            if (stack.isEmpty()) {
                return false;
            }
            //if bracket are closing then move to switvh state
            //here we check closed bracket match to open bracket in stack
            char popc;
            switch (current) {
                case ')':
                    popc = (char) stack.pop();
                    if (popc == '{' || popc == '[')
                        return false;
                    break;
                case '}':
                    popc = (char) stack.pop();
                    if (popc == '(' || popc == '[')
                        return false;
                    break;
                case ']':
                    popc = (char) stack.pop();
                    if (popc == '(' || popc == '{')
                        return false;
                    break;
            }
        }
        return (stack.isEmpty());
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input string to check:");
        String str = sc.nextLine();

        if (balancPar(str))
            System.out.println("Input string is balanced.");
        else
            System.out.println("Input string is not balanced.");
    }
}