package ArrayProblem;


//import java.util.Random;

public class secondLargest {
    public static void main(String[] args) {
        TakeInput obj=new TakeInput();
//        Random random=new Random();
        int[] array=obj.TInput();
        int secondL=0;
//        int lastL=array[random.nextInt(array.length)];
        int Largest=Integer.MIN_VALUE;
        for (int i :array) {
            if(Largest<i){
                secondL=Largest;
                Largest=i;

            }
            else if (i<Largest &&i>secondL){
                secondL=i;

            }

        }
        System.out.println("Second largest number is "+secondL);

    }
}
