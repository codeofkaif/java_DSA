package ArrayProblem;

public class seconSmallest {
    public static void main(String[] args) {
        TakeInput obj=new TakeInput();
        int[] array=obj.TInput();
        int firstMin=Integer.MAX_VALUE;
        int secondMin=0;
        for(int i:array) {
            if (firstMin >i) {
                secondMin=firstMin;
                firstMin=i;

            }
            else if (i!=firstMin&& i<secondMin){
                secondMin=i;
            }
        }
        System.out.println("Second Smallest number is "+secondMin);
    }
}
