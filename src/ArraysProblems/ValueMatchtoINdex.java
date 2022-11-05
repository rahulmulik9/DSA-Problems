package ArraysProblems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ValueMatchtoINdex {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            ArrayList<Integer> ans = new Solution().valueEqualToIndex(arr, n);
            if (ans.size() == 0) {
                System.out.println("Not Found");
            } else {
                for (Integer x : ans) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
        }
    }
}

class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here

        ArrayList<Integer> ary = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == (i + 1)) {
                ary.add(arr[i]);
            }
        }
        return ary;

    }
}