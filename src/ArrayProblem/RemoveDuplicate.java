package ArrayProblem;
// it works  only on sorted array6

public class RemoveDuplicate {
    public static void main(String[] args) {
        TakeInput obj = new TakeInput();
        int[] array = obj.TInput();
//        int temp= Integer.parseInt(null);
        int count=0;
        int temp = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[temp] != array[i]) {
                count++;
                array[temp + 1] = array[i];
                temp++;


            }
        }
        for(int i=0;i<temp+1;i++){
            System.out.printf("%d ",array[i]);
        }
        System.out.println("Total uniq number"+count);

    }
}
