package RAJA;

public class PrintingNumber {
    public static void main(String[] args) {
        int a = 23546;
        int i = 0;
        while (a > 0) {
            int b = a % 10;
            int c = 10;
            System.out.println((int)(b * (Math.pow(10, i))));
            a = a / 10;
            i++;
        }

    }
}
