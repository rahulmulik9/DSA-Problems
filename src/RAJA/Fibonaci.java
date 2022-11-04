package RAJA;

public class Fibonaci {
 public static void withOutRecursion(int n){
     int a=0;
     int b=1;
     int c;
     for(int i=0;i<n;i++){
         c=a+b;
         System.out.print(a+", ");
         a=b;
         b=c;
     }
 }

 public static int withRecursion(int a){
     if(a<=1){
         return 1;
     }else {
        return withRecursion(a-1)+withRecursion(a-2);
     }
 }
    public static void main(String[] args) {
        withOutRecursion(9);
        System.out.println("");
//        System.out.println( withRecursion(9));

    }
}
