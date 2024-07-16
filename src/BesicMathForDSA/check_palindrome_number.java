package BesicMathForDSA;
import java.util.Scanner;
public class check_palindrome_number {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int check=n;
        int revNum=0;
        while (n>0){
            int k=n%10;
            revNum=revNum*10+k;
            n=n/10;

        }
        if(check==revNum) System.out.println("*"+check+"*" +"this is palindrome  number ");
        else System.out.println("*"+check+"*" +"this is not palindrome  number ");



    }
}
