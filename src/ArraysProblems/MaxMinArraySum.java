package ArraysProblems;


import java.io.*;
import java.util.*;


public class MaxMinArraySum {

    public static int findSum(int[] nums,int N)
    {
        //code here
        int max = nums[0];
        int min = nums[0];

        // do for each array element
        for (int i = 1; i < nums.length; i++)
        {
            // if the current element is greater than the maximum found so far
            if (nums[i] > max) {
                max = nums[i];
            }

            // if the current element is smaller than the minimum found so far
            else if (nums[i] < min) {
                min = nums[i];
            }
        }

        int sum=min+max;
        return sum;


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            System.out.println(findSum(a, n));
        }

    }

}






