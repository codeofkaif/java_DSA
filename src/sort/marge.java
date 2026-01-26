package sort;

public class marge {
    public static void marg(int[] array,int left,int middle,int right){
        // size of subarrays
        int n1=middle-left+1;
        int n2= right-middle;
        //Temporary arrays
        int[] leftArray=new int[n1];
        int[] rightArray=new int[n2];
        for (int i = 0; i <n1 ; i++) leftArray[i] = array[left + i];
        for (int i = 0; i < n2; i++) rightArray[i]=array[middle+1+i];

        int i=0,j=0;
        int k=left;
        while(i<n1&&j<n2){
            if (leftArray[i]<=rightArray[j]) {
                array[k]=leftArray[i];
                i++;

            }
            else {
                array[k]=rightArray[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            array[k]=leftArray[i];
            i++;
            k++;
        }
        while(j<n2){
            array[k]=rightArray[j];
            j++;
            k++;
        }
    }
}
