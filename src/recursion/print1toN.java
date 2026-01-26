package recursion;
import java.util.Scanner;
public class print1toN {
//    public static void main(String[] args) {
////        System.out.println("Enter the number still you want to print");
////        Scanner sc=new Scanner(System.in);
////        int n=sc.nextInt();
////        int k=1;
////        loop(n,k);
////
////    }
////    public static void loop(int n,int k){
////
////
////        if(n<k) return;
////        else System.out.println(k); k++;
////        loop(n,k);
//
//
//    }
    public static void main(String[] kaifkhan) {
        System.out.println("Enter the number still you want to ptint ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        print_1_to_n(n);
    }
    public static void print_1_to_n(int n){
        if(n<1) return;
        else {
            print_1_to_n(n - 1);
            System.out.println(n);
        }
    }


}
