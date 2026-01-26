package ArrayProblem;
    



public class largestElement {
    public static void main(String [] args){
        TakeInput obj=new TakeInput();
        int[] arr=obj.TInput();
        int max=arr[0];
        for (int j : arr) {
            if (max < j) {
                max = j;
            }

        }
        System.out.printf("Maximum Element Of Array %d",max);

    }
}


