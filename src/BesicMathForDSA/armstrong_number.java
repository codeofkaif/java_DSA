package BesicMathForDSA;
import java.util.Scanner;
public class armstrong_number {
    public static void main(String[] args) {
        System.out.println("Enter your number for checking armstrong number ");
        Scanner dc=new Scanner(System.in);
        int n=dc.nextInt();
        int cnt=0;
        int arm=n;
        int preserve=arm;
        int value=0;


        while(arm>0){
            arm=arm/10;

            cnt++;

        }

        while(preserve>0){
            int k =preserve%10;
            int m=1;

            for(int i=1;i<=cnt;i++){
                m=m*k;


            }
            value+=m;
            preserve=preserve/10;

        }
        if (n==value){
            System.out.println(value+" this armstrong number");
        }
        else{
            System.out.println(value+"this is not armstrong number");
        }
    }

}
