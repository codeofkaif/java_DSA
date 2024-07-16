package loop_practice;
import java.util.Scanner;

public class pyramid_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of row");
        int n=sc.nextInt();
        for (int i =0 ; i<n;i++){
            for (int j=0;j<i+1;j++) {
                System.out.print(" ");
            }
            for (int k = 0 ; k<2*n-(2*i+1);k++){
                System.out.print("*");
            }
            for (int l=0; l<i+1;l++) {
                System.out.print(" ");
            }
            System.out.println();
        }


    }

}
