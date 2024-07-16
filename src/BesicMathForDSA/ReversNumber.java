package BesicMathForDSA;
import java.util.Scanner;
public class ReversNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int show_this=n;
        int revNum=0;
        while (n>0){
            int k=n%10;
            revNum=revNum*10+k;
            n=n/10;

        }
        System.out.println(revNum+ "this is revers number of "+show_this);
    }
}
