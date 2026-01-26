package ArrayProblem;
// this code for rotating array by using one element

public class LeftrotateTheArrayByOnePlace {
    public static void main(String[] args) {
        TakeInput input=new TakeInput();// creating object for taking input, it's code in another class
        int[] array=input.TInput();
//        int tamp=array[0];// it also a correct way to rotate one place of array
        for (int i = 1; i < array.length; i++) {
            int tamp=array[i-1];
            array[i-1]=array[i];
            array[i]=tamp;

        }
//        array[array.length-1]=tamp;
        for (int j : array) {
            System.out.printf("%d ", j);
        }
    }

}
// time complexity of this o(n),