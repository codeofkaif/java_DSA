package loop_practice;
import java.util.Scanner;
public class pattern_12 {
    public static void main(String[] args) {
        System.out.println("Enter the number of row");
        Scanner sc = new Scanner(System.in);
        int s = 1;
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(s);
                s++;
            }
            System.out.println();
        }
        // pattern_13 integer to character
        int value = 65;
        for (int i = 1; i <= n; i++) {
            for (int j = value; j <= value + i; j++) {
                System.out.print((char) j);


            }
            System.out.println();

        }
        for (int i = 0; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int l = value; l <= value + i; l++) {
                System.out.print((char) l);
            }
            for (int m = value + i - 1; m >= value; m--) {
                System.out.print((char) m);
            }
            System.out.println();
        }
        //again
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            int breakPoint = (2 * i + 1) / 2;
            for (int k = 1; k <= 2 * i + 1; k++) {
                System.out.print(ch);
                if (k <= breakPoint) ch++;
                else ch--;


            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        //pattern_19
        int inis=0;
        //for star
        for (int i = 0;i<n;i++){
            System.out.println();
            for (int j=0;j<n-i;j++){
                System.out.print("*");
            }
            //for space
            for(int j=0;j<inis;j++) {
                System.out.print(" ");

            }
            //for star
            for (int j=0;j<n-i;j++){
                System.out.print("*");
            }
            inis+=2;


        }
        for (int i = 0;i<=n;i++){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            //for space
            for(int j=0;j<2*n-2*i;j++) {
                System.out.print(" ");

            }
            //for star
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}