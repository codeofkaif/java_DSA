package Revision.arrayProblem;

public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {45,3,5,342,25,6,3,6,6,67,45,53,4365,53,43,465,3,4};
        int max =arr[0];
        int secondMax=arr[0];
        for(int item: arr){

           if(item>max){
               secondMax = max;
               max=item;
           }else if(item>secondMax){
               secondMax=item;
           }

        }
        System.out.println("secondMax= "+secondMax);
    }
}
