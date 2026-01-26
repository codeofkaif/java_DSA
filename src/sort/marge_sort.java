package sort;

import static sort.marge.marg;

public class marge_sort {
    public static void MargeSort(int[] array,int left,int right){
        if(left<right){
            int middle=(left+right)/2;
            MargeSort(array,left,middle);
            MargeSort(array,middle+1,right);
            marg(array,left,middle,right);
        }
    }

    public static void main(String[] args) {
        int[] array={4,2,4,6,7,8,9,4,2,1,5,6,2,6};
        //print this array before sorting
        for (int i: array){
            System.out.print(" "+i);
        }
        System.out.println();
        MargeSort(array,0, array.length-1);
        // print this array after sorting
        for (int i: array){
            System.out.print(" "+i);
        }
    }
}
