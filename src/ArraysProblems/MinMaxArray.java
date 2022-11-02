package ArraysProblems;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxArray {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter no of elements");
        int num= sc.nextInt();
        int[] numbs=new int[num];

        for (int i=0;i<num;i++){
            System.out.println("enter "+i+" element");
            int a=sc.nextInt();
            numbs[i]=a;
        }

        Arrays.sort(numbs);
        int min=numbs[0];
        int max=numbs[numbs.length-1];

        System.out.println("min = "+min);
        System.out.println("max = "+max);

    }
}
