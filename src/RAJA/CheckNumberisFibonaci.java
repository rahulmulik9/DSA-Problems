package RAJA;


import java.util.Scanner;

public class CheckNumberisFibonaci {
    public static boolean checkFiboaci(int n) {
        int a = 0;
        int b = 1;
        if (n == a || n == b) return true;
        int c = a + b;
        while (c <= n) {
            if (c == n) return true;
            a = b;
            b = c;
            c = a + b;
        }
        return false;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        if(checkFiboaci(a)== true){
            System.out.println("Number is fibonaci");
        }else {
            System.out.println("Number is not fibonaci");
            int d=0;
            int b=1;
            int c=d+b;
            while(d<=a){
                c=d+b;
                System.out.print(d+",");
                d=b;
                b=c;
            }

//            if(a%2==0){
//                while (a>0){
//                    System.out.print((a)+", ");
//                    a=a-2;
//                }
//            }else {
//                a=a-1;
//                while (a>0){
//                    System.out.print((a)+", ");
//                    a=a-2;
//                }
//            }

        }

    }
}
