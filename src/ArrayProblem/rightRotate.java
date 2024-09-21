package ArrayProblem;

public class rightRotate {
    public static void RightrotateByN(int[] array, int n) {
        int k=array.length-1;
        while(n!=0){
            for (int i = array.length - 2; i >= 0; i--) {

                    int temp = array[i];
                    array[i] = array[k];
                    array[k] = temp;
                }
            n--;
            k--;


            }

        for(int j: array){
            System.out.printf("%d ",j);
        }
    }

    public static void main(String[] args) {
        TakeInput input=new TakeInput();
        int[] array=input.TInput();
        RightrotateByN(array,2);

    }
}
