package RAJA;

import java.util.ArrayList;
import java.util.Scanner;

public class FindDuplicateinList {

    public static void removeDuplicates(ArrayList<Integer> arlst){
        ArrayList<Integer> arls=new ArrayList<Integer>();

        for (int a:arlst) {
            if(!arls.contains(a))
                arls.add(a);
        }
      for(int a:arls){
          System.out.print(a);
      }

    }
    public static void main(String[] args) {
        ArrayList<Integer> arlst=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        boolean stop=true;

        while (stop){
            System.out.println("Enter elements");
            int a= sc.nextInt();
            if(a != 0)arlst.add(a);
            else stop=false;
        }

        removeDuplicates(arlst);


    }

}

