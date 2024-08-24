package recursion;
import java.util.Scanner;
public class printName5time {
    public static void loop(int n) {
        if(n==0){
            return ;
        }
        else{
            System.out.println("kaif khan");
            n--;
            loop(n);
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter the number how many time you want to print your name?");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        loop(n);
    }

}
