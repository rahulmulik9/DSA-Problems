package RAJA;

import java.util.Scanner;

public class PrintSumOfEvenInarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("array length");
        int size=sc.nextInt();
        int[] num=new int[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter "+(i+1)+" Interger");
            num[i]= sc.nextInt();
        }

        int sum=0;
        for(int i=0;i<size;i++){
            if(num[i]%2==0){
                sum=sum+num[i];
            }

        }


        System.out.println("Sum of even numbers "+sum);
    }
}
