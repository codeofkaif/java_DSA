package recursion;
import java.util.Scanner;

import static java.util.Collections.swap;

public class AllinOne {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the number for factorial");
        int fact=sc.nextInt();
        System.out.println("Enter number for sum");
        int sum=sc.nextInt();
        System.out.println("Enter the size of array ");
        int size=sc.nextInt();
        
        int[] ar=new int[size];
        System.out.println("Enter value in array");
        for (int i=0;i<size;i++){
            ar[i]=sc.nextInt();
        }
//        swapping(0,ar,n);
        loop(n);
        int k=0;
        sum_of_N_num(n,k);
        System.out.println("factorial is: "+factorial(fact));
        System.out.println("sum of all number: "+sum_2(sum));

;
    }
    public static void loop(int n){
        if(n==0) return;
        else System.out.println(n); n--;
        loop(n);
    }
    public static void sum_of_N_num(int n ,int k){
        k+=n;
        if (n==0) {
            System.out.println("sum of all N number "+k);
            return;
        }

        n--;

        sum_of_N_num(n,k);




    }
    public static int factorial(int n) {

        if (n==0) return 1;
        else {
            return n*factorial(n-1);

        }

    }
    public static int sum_2(int n){
        if(n==0) return 0;
        else return n+sum_2( n-1);


    }
//    public static void swapping(int i, int[] ar,int n){
//        if (i>n/2) return;
//        else{
//            swap(ar[i],ar[n-i-1]);
//        }
//        swapping(i+1,ar,n);
        
        
    }




