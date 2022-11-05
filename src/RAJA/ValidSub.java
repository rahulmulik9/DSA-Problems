package RAJA;
// Java program to find whether an array
// is subset of another array

class ValidSub {

    static boolean sub(int arr1[], int arr2[], int m,
                            int n)
    {
        int i = 0;
        int j = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++)
                if (arr2[i] == arr1[j])
                    break;

            if (j == m)
                return false;
        }


        return true;
    }

    // Driver code
    public static void main(String args[])
    {
        int arr1[] = new int[]{5, 1, 22, 25, 6, 10} ;
        int arr2[] = new int[]{1, 6, 10};

        int m = arr1.length;
        int n = arr2.length;

        if (sub(arr1, arr2, m, n))
            System.out.print("True");
        else
            System.out.print("False");
    }
}
