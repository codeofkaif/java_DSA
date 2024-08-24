package sort;
import java.util.Scanner;

public class insertion {
    public int[] sort(int[]arr, int n){
        for (int i=0;i<n;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }
        }
        return arr;

    }
}

class Sort{
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner input=new Scanner(System.in);
        int n = input.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }

        insertion obj=new insertion();
        arr=obj.sort(arr,n);
        for (int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }

}
