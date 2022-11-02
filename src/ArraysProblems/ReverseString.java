package ArraysProblems;

import java.util.Scanner;

//problem Statement
//reverse  given string
public class ReverseString {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter String");
        String sen=sc.nextLine();
        String result="";
        for(int i=sen.length()-1;i>=0;i--){
            result+=sen.charAt(i);
        }
        System.out.println(result);
    }
}
