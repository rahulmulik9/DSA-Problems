package RAJA;

public class FindNextPrimeNumber {
    public static void main(String[] args) {
        int a = 118;
        boolean found = true;

        while (found) {
            a = a + 1;
            if (isPrime(a)) found = false;
        }
        System.out.println(a);

    }

    private static boolean isPrime(int a) {
        if (a % 2 == 0 || a % 3 == 0) return false;
        for (int i = 5; i * i <= a; i = i + 6)
            if (a % i == 0 || a % (i + 2) == 0) return false;

        return true;
    }
}
