package recursion;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] kaifkhan){
        System.out.println("Check palindrome number");
        Scanner input =new Scanner(System.in);
        int number = input.nextInt();
        int newNumber=isPalindrome(number,0);
        if(number == newNumber){
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Number is not a palindrome");
        }

    }
    public static int isPalindrome(int n ,int rev){

        if(n == 0) return rev;
        else{
             rev=  rev*10 + n%10;

            return isPalindrome(n/10,rev);
        }
    }
}
