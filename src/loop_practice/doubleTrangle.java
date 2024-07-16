package loop_practice;

import java.util.Scanner;

public class doubleTrangle {
    public static void main(String[] args) {
        System.out.println("Enter the number of row");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n*2-1; i++) {
            int number_1=i;
            if (i>n) number_1=2*n-i;

            for (int j=1;j<number_1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}