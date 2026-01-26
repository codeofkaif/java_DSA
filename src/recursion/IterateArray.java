package recursion;

public class IterateArray {
    public static void main(String[] args) {
        int[] arr = {12,3,4 ,5 ,6 ,7 ,23};
        printArr(arr, 0);
        int max = MaxValue(arr , 0,0);
        System.out.println("max Value "+max);
    }


    public static void printArr(int[] arr, int i){
        if( i== arr.length) return;

        System.out.println(arr[i]);
        printArr(arr,i+1);
    }
//    public static int MaxValue(int[] arr , int idx){
//        if( idx == arr.length-1) return arr[idx];
//        int ans = MaxValue(arr, idx+1);
//        return  Math.max(arr[idx] , ans);
//    }
    public static int MaxValue(int[] arr , int idx, int mx){
        if( idx == arr.length) return mx;
        mx= Math.max(mx, arr[idx]);
        return  MaxValue(arr , idx+1,mx);
    }

}
