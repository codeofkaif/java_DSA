package loop_practice;
import java.util.Scanner;

public class reversTrangle {
    public static void main(String[] args) {
        System.out.println("enter the number of row");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the number of colom");
        int m = sc.nextInt();
        for (int i = 1; i<=n; i++){
            for(int j = 1; j<=(m+1)-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
