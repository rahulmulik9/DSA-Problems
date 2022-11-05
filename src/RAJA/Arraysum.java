package RAJA;// Java program to sum two numbers
// represented two arrays.
import java.io.*;

// Java program to sum two numbers
// represented two arrays.
import java.io.*;

class Arraysum {

    static int calSumUtil(int first[], int seccond[],
                          int n, int m)
    {
        int[] sum= new int[n];

        //k index of sum array
        //i is index of first array
        //j is index of second array

        int i = n - 1, j = m - 1, k = n - 1;

        int cary = 0, s = 0;

        while (j >= 0)
        {
            //  sum  last element of both array. at fist position in sum
            s = first[i] + seccond[j] + cary;

            //storing element at last of sum array
            sum[k] = (s % 10);

            // carry sum.
            cary = s / 10;

            k--;
            i--;
            j--;
        }

        // If second array size is less the first array size so carry will add to fisrt elemetn itself
        while (i >= 0)
        {
            // Add carry to first array elements.
            s = first[i] + cary;
            sum[k] = (s % 10);
            cary = s / 10;

            i--;
            k--;
        }

        int ans = 0;

        //if there is any carry left then that is first element of sum
        //or ans remain zero
        if (cary == 1)
            ans = 10;

        // Converting array into number.
        for ( i = 0; i <= n - 1; i++) {
            ans += sum[i];
            ans *= 10;
        }

        return ans / 10;
    }


   //check which array is greater
    static int calSum(int a[], int b[], int n,
                      int m)
    {
        if (n >= m)
            return calSumUtil(a, b, n, m);

        else
            return calSumUtil(b, a, m, n);
    }



    public static void main(String[] args)
    {
        int a[] = { 9, 3, 9 };
        int b[] = { 6, 1 };

        int n = a.length;
        int m = b.length;

        System.out.println(calSum(a, b, n, m));
    }
}


