package ArraysProblems;

//Given an array, rotate the array by one position in clock-wise direction

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CyclicRotateArray {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int t =
                Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }

            Compute obj = new Compute();
            obj.rotate(a, n);

            StringBuilder output = new StringBuilder();
            for (int i = 0; i < n; i++)
                output.append(a[i] + " ");
            System.out.println(output);

        }
    }
}

class Compute {

    public void rotate(int arr[], int n) {

        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];

        }
        arr[0] = temp;

    }
}