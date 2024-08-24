//hashing -> prestore  something and fetch one












package hashng;
import java.util.Scanner;
//import java.lang.String;
public class basic_of_hashing {
    public static void main(String[] args) {
//        System.out.println("Enter size of array");
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int[] array = new int[n];
//        System.out.println("Enter the value in array");
//        // for input
//        for (int i = 0; i < array.length; i++) {
//            array[i] = input.nextInt();
//        }
//        // pre compute
//        int[] hash = {0};
//        hash = new int[100000];
//        for (int i = 0; i < array.length; i++) {
//            hash[array[i]] += 1;
//        }
//        System.out.println("Enter your value that you want to find");
//        int k = input.nextInt();
//        System.out.println("found: " + hash[k] + "times");
        System.out.println("Enter any string");
        Scanner input=new Scanner(System.in);
        String name=input.nextLine();
        // pre computing
        int[] hash={0};
        hash=new int[256];
        for (int i=1;i<name.length();i++){
            hash[(int)name.charAt(i)]+=1;
        }
        // check
        System.out.println("Enter any latter for checking its occurrences");

        String k=input.next();
        System.out.println("found it: "+hash[(int)'k']);
        System.out.println((char) 107);

    }


}
