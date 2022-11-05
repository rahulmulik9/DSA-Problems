package RAJA;

import java.util.Scanner;

public class Squareroot {
    public static int mySqrt(int x) {
    int root= (int)Math.sqrt(x);
    return root;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= sc.nextInt();
        System.out.println(mySqrt(num));
    }
}
