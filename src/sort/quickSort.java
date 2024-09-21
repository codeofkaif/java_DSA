/* A quick sort works as follows:  The algorithm selects an element , called the pivot, in the array.
* iIt divides the array into two parts, so that all the elements in the first part are less than or equal to the pivot and all the elements
* in the second part are greater than the pivot . The  quick sort algorithm is then recursively applied to the first part then second part*/

package sort;



public class quickSort {
     quickSort(int[] array, int low, int high) {
        if (low < high) {
            int piovtIndex = partition(array, low, high);
            new quickSort(array, low, piovtIndex - 1);
            new quickSort(array, piovtIndex + 1, high);

        }


    }
    private static int partition(int[] array,int low,int high){
        int pivot=array[high];
        int i=low;
        for (int j = low; j <high ; j++) {
            if (array[j]<pivot) {

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
            }

        }
        int temp=array[i];
        array[i]=array[high];
        array[high]=temp;
        return i;
    }

}
