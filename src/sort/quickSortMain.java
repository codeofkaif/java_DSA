package sort;
import ArrayProblem.TakeInput;


public class quickSortMain {
    public static void main(String[] args) {
        boolean check=true;
        TakeInput obj=new TakeInput();
        int [] array= obj.TInput();
        System.out.println("Original array! ");
        for(int j:array){
            System.out.printf(" %d",j);
        }
        new quickSort(array, 0, array.length - 1);
//        System.out.println("Original Array "+ Arrays.toString(array));
//        int[] array2=quickSort(array, 0, array.length - 1);
        System.out.println("Sorted array\n");
        for(int j:array) {
            System.out.printf(" %d ", j);
        }


    }
}
