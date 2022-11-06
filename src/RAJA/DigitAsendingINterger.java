package RAJA;

import java.util.ArrayList;
import java.util.Scanner;

public class DigitAsendingINterger {
    public static boolean isAscending(ArrayList<Integer> ary){
        for (int i=0;i< ary.size()-1;i++){
            if(ary.get(i)> ary.get(i+1))
                return true;
            return false;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();

        ArrayList<Integer> ary=new ArrayList<Integer>();

        while(a>0){
            int c=a%10;
            ary.add(c);
            a=a/10;
        }

        if(isAscending(ary)){
            System.out.println("In acending order");
        }else {
            System.out.println("Not Ascending order");
        }
    }
}
