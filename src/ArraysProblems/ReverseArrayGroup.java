package ArraysProblems;

import java.util.Scanner;

//given array 1,4,5,7,1,5,6,7,5,2
//k=3  then o/p is 5,4,1,5,1,7,5,7,6,2
public class ReverseArrayGroup {
    public static Scanner sc = new Scanner(System.in);

    public static void sortByGroup(int[] arb, int key, int a) {
        int first = 0;
        int r=0;
        int y=key-1;
        int last = key - 1;
        for(int j=0;j<a;j=j+key) {
            if (last > a) {
                last = a-1;
            }
            while(first<last) {
                int temp = arb[first];
                arb[first] = arb[last];
                arb[last] = temp;
                first++;
                last--;
            }
            first=r+key;
            last=y+key;
        }

        for (int d:arb) {
            System.out.print(d+", ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter no of elemet");
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.println("Enter " + (i + 1) + "elements");
            int s = sc.nextInt();
        }

        System.out.println("Element group number");
        int key = sc.nextInt();

//        int[] arr=new int[]{1,2,3,4,5,6};
//        int key=3;
//        int a=6;

        sortByGroup(arr, key, a);

    }
}
