package ArraysProblems;


//Given an array arr[] and an integer K where K is smaller than size of array,
// the task is to find the Kth the smallest element in the given array.
// It is given that all array elements are distinct.

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestElement {
    public static int kthSmallest(int[] arr, int l, int r, int k)
    {
        //Your code here
        Arrays.sort(arr);
        return arr[k-1];

    }

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t=sc.nextInt();

        while(t-->0)
        {
            int n=sc.nextInt();

            int arr[]=new int[n];

            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();

            int k=sc.nextInt();

            out.println(kthSmallest(arr, 0, n-1, k));
        }
        out.flush();
    }

}


