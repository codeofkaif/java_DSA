//import java.util.Scanner;
//public class TakeInput{
//
//    public static int[] input(){
//        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[5];
//
//
//        return arr;
//    }
//    sc.close();
//}





 package ArrayProblem;

 // import java.awt.im.InputContext;
 import java.util.Scanner;

 public class TakeInput {
     public int[] TInput() {
         System.out.println("Enter the size of array");
         Scanner input = new Scanner(System.in);
         int n = input.nextInt();
         int[] arr = new int[n];
         System.out.println("Enter the value in array");
         for (int i = 0; i < n; i++) {
             arr[i] = input.nextInt();

         }


         return arr;

     }

 }
    
    
// }
