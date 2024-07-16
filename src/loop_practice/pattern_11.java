package loop_practice;
import java.util.Scanner;
public class pattern_11 {
    public static void main(String[] args) {
        System.out.println("Enter the number of row");
        Scanner sc = new Scanner(System.in);
        int row=sc.nextInt();
        for (int i = 0; i<row;i++){
            for(int j=0; j<i+1;j++){
                System.out.print(j+1);
            }
            for (int k=0;k<2*row-2*i-2; k++){
                System.out.print(" ");
            }
            for(int l =i+1;l>0;l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
