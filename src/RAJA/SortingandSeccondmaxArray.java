package RAJA;

public class SortingandSeccondmaxArray {
    public static void main(String[] args) {
        int[] abc = new int[]{5, 7, 1, 6, 4, 9};
        int[] abc2=new int[abc.length];

        for (int i = 0; i < abc.length; i++) {
            for (int j = i + 1; j < abc.length; j++) {

                int temp = 0;
                if (abc[i] > abc[j]) {
                    temp = abc[i];
                    abc[i] = abc[j];
                    abc[j] = temp;
                }
            }
            abc2[i]=abc[i];
        }

//        for (int a:abc2 ) {
//            System.out.print(a+", ");
//        }

        System.out.println("Seccond max elements is : "+abc2[abc.length-2]);

    }



}
