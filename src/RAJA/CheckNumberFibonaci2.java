package RAJA;
//condition for number is
//N is a Fibonacci number if and only if ( 5*N2 + 4 ) or ( 5*N2 – 4 ) is a perfect square!


import java.util.Scanner;

public class CheckNumberFibonaci2 {
    public static boolean checkFiboaci(int a) {
        int b = 5 * a * a - 4;
        int c = 5 * a * a + 4;
        boolean bb = isfirstPerfect(b);
        boolean cc = isfirstPerfect(c);
        if (bb == true || cc == true)
            return true;
        return false;
    }

    private static boolean isfirstPerfect(int z) {

        int n = (int) Math.sqrt(z);
        if ((n * n) == z)
            return true;
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");

        int a = sc.nextInt();
        if (checkFiboaci(a) == true) {
            System.out.println("Number is fibonaci");
        } else {
            System.out.println("Number is not fibonaci");
            int d = 0;
            int b = 1;
            int c = d + b;
            while (d <= a) {
                c = d + b;
                System.out.print(d + ",");
                d = b;
                b = c;
            }
        }
    }
}
