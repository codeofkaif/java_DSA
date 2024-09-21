package sort;

import java.util.Scanner;


public class selection_sort {
    int[] sort(int[] arr,int n){
        for(int i=0; i<n-1 ;i++){
            int min=i;
            for (int j=i+1;j<=n-1;j++) {
                if (arr[j] <arr[min]) {
                    min = j;
                }

            }
            int tamp=arr[i];
            arr[i]=arr[min];
            arr[min]=tamp;
        }
        return arr;
    }

}
class result{
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter all value in array");
        for (int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        selection_sort obj=new selection_sort();
        arr=obj.sort(arr,n);
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            }


    }

}
