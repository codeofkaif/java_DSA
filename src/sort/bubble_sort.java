package sort;
import java.util.Scanner;
public class bubble_sort {
    int[] bubble_1(int[] arr, int n){
        for(int i=0;i<n-1;i++){
            int count=0;
            for (int j=0;j<n-1-i;j++){

                if(arr[j]>arr[j+1]){
                    int tamp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tamp;
                    count=1;
                }

            }
            if (count==0){
                break;
            }

        }
        return arr;
    }
}
class answer {
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the value in array");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        bubble_sort obj = new bubble_sort();
        arr=obj.bubble_1(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }




    }

}