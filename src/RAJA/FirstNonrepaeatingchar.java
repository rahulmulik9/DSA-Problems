package RAJA;

import java.util.Scanner;

public class FirstNonrepaeatingchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ab = sc.nextLine();
        String abc = ab.toLowerCase();
        for (int i = 0; i < abc.length(); i++) {
            char c = abc.charAt(i);
            int a = abc.indexOf(c) + 1;
            if (abc.indexOf(c, a) == -1) {
                System.out.println("First Non repaeating char is : " + abc.charAt(i));
                break;
            }
        }
    }
}
