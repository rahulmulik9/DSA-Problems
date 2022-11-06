package ArraysProblems;

import java.util.HashSet;
import java.util.Set;

//Given two arrays a[] and b[] of size n and m respectively. The task is to find union between these two arrays.
//Input:
//        5 3
//        1 2 3 4 5
//        1 2 3
//        Output:
//        5
//        Explanation:
//        1, 2, 3, 4 and 5 are the
//        elements which comes in the union set
//        of both arrays. So count is 5.
public class UnionOfTwoArray {

    public static void main(String[] args) {
        int[] a=new int[]{1,2,3,4,5};
        int[] b=new int[]{1,2,3};
        int c=a.length;
        int d=b.length;

        Set<Integer> numb = new HashSet<Integer>();
        for(int i=0;i<c;i++){
            numb.add(a[i]);
        }
        for(int i=0;i<d;i++){
            numb.add(b[i]);
        }

        int x=numb.size();
        System.out.println(x);



    }
}
