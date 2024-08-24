//package BesicMathForDSA;
//import java.util.Scanner;
//public class GCD {
//    public static void main(String[] args) {
//        System.out.println("Enter number ");
//        Scanner sc=new Scanner(System.in);
//        int n1=sc.nextInt();
//        int n2=sc.nextInt();
//        int gcd=0;
//
//    }
//
//}
//using *Euclidean
package BesicMathForDSA;
import java.util.Scanner;
public class GCD{
    public static void main(String[] args) {
        System.out.println("Enter the value of 'a' and 'b' ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        while(a>0&&b>0){
            if(a>b) a=a%b;
            else b=b%a;
        }
            if(a==0) System.out.println(b+  "is GCD" );
            else System.out.println(a+  " is GCD");


    }
}