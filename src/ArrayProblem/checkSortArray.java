package ArrayProblem;

public class checkSortArray {
    public static void main(String[] args) {
        TakeInput obj=new TakeInput();
        int[] array=obj.TInput();
        boolean sorted=true;
        for (int i = 1; i < array.length ;i++) {
            if (array[i-1]>array[i]) {
               sorted=false;
                break;
            }
        }
        if(sorted){
            System.out.println("Array is sorted");

        }
        else System.out.println("Array is not sorted!");
    }

}
