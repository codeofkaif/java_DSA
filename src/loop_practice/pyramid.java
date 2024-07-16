package loop_practice;
import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        System.out.println("Enter the number of row");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i<=n;i++){
            for (int j =1; j<=(n+1)-i;j++) {
                System.out.print(" ");
            }
            for (int k =1 ; k<=i; k++){
                System.out.print("*");}
            for (int l = 1 ; l<i;l++){
                System.out.print("*");
            }
            System.out.println();


        }
    }

}
