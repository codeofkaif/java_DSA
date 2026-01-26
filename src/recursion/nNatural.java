package recursion;

import java.util.Scanner;

//given a number N, Find the n natural number till n but with alternat sign
public class nNatural {
    public static void main(String[] args) {
        System.out.println("Give me Number sum of alternat ");
        Scanner input = new Scanner(System.in);
        int n =input.nextInt();
        int sum = sum_all(n);
        System.out.println("Sum of all "+ sum);
//        if(n%2==0){
//            System.out.println("Sum Of All " + -n/2);
//        }
//        else{
//            System.out.println("Sum Of All " + (n+1)/2);
//        }

        //trough recursive call

    }
    public static int sum_all(int n) {
        if(n==0) return 0;
        if(n%2 == 0) return -n;
        return sum_all(n-1) + n;

    }
}
