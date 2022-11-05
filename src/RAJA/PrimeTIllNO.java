package RAJA;

import java.util.Scanner;

public class PrimeTIllNO {
    public static boolean isPrime(int a) {
        if (a <= 1) return false;
        else {
            for (int i = 2; i < a; i++)
                if (a % i == 0)
                    return false;
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 2; i < a; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
