package RAJA;

public class MergeArrayWithAlternatre {
    public static void main(String[] args) {
        String[] arr = new String[]{"1", "2", "3", "4", "5"};
        String[] arr2 = new String[]{"a", "b", "c", "d"};

        int size = arr.length + arr2.length;
        String[] arr3 = new String[size];

        int a = 0;
        for (int i = 0; i < Math.max(arr2.length, arr.length); i++) {
            if (i < arr.length) {
                arr3[a++] = arr[i];
            }
            if (i < arr2.length) {
                arr3[a++] = arr2[i];
            }

        }

        for (String c : arr3) {
            System.out.print(c);
        }

    }
}
