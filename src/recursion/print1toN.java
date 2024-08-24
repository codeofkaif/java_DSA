package recursion;
import java.util.Scanner;
public class print1toN {
    public static void main(String[] args) {
        System.out.println("Enter the number still you want to print");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=1;
        loop(n,k);

    }
    public static void loop(int n,int k){


        if(n<k) return;
        else System.out.println(k); k++;
        loop(n,k);


    }
}
