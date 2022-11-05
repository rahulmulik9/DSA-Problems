package RAJA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NoOfOwelCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sen = sc.nextLine();

        String sen1 = sen.toLowerCase().replaceAll(" ", "");
        System.out.println(sen1);
        int ocount = 0;

        HashMap<Character, Integer> map = new HashMap<>();


        for (int i = 0; i < sen1.length(); i++) {
            if (map.containsKey(sen1.charAt(i))) {
                map.put(sen1.charAt(i), map.get(sen1.charAt(i)) + 1);
            } else {
                map.put(sen1.charAt(i), 1);
            }
        }


        for (int i = 0; i < sen1.length(); i++) {
            if (sen.charAt(i) == 'a' || sen.charAt(i) == 'e' || sen.charAt(i) == 'i' || sen.charAt(i) == 'o' || sen.charAt(i) == 'u') {
                ocount = ocount + 1;
            }
        }

        if (ocount % 2 == 0) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }

    }
}
