package Backtracking;

public class subsequenceAfterCopy {
    public static void main(String[] args) {
       int[] nums = {4,3,2,4};
        boolean[] ans = subsequenceSumAfterCapping(nums , 5);
        for(boolean item : ans){
            System.out.println(item);
        }


    }


        public static boolean[] subsequenceSumAfterCapping(int[] nums, int k) {
            int n = nums.length;
            int[][] coppiedArr = new int[n][n];
            int x = 1;
            for(int i = 0 ; i< n ; i++){

                for (int j= 0; j< n ; j++){
                    coppiedArr[i][j] = Math.min(nums[j] , x);
                }
                x=x+1;

            }


            boolean[] ans = new boolean[n];
            for(int i = 0 ; i<n ; i++){
                int[] newArr= new int[n];
                for(int j =0; j< n ; j++){
                    newArr[j] = coppiedArr[i][j];
                }

                ans[i] = checkSubsequence(newArr, 0, k);

            }
            return ans;



        }
        public static boolean checkSubsequence(int[] arr, int index, int target) {

            if (target == 0) return true;

            if (index == arr.length) return false;


            if (arr[index] <= target) {
                if (checkSubsequence(arr, index + 1, target - arr[index])) {
                    return true;
                }
            }
            return checkSubsequence(arr, index + 1, target);
        }

}
