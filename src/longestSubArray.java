

public class longestSubArray{
	public static int subArray(int[] nums , int k){
		int sum = 0, maxLen = 0 , start = 0;
		for(int i = 0;i< nums.length; i++){
			sum+= nums[i];
			while(sum>k){
				sum-= nums[start];
				start++;
			}
			if(sum == k){
			maxLen = Math.max(maxLen, i - start+1);
			}
		}
		return maxLen;
	}
	
	public static void main(String[] args){
		int[] arr = {0 ,3,6,2,4,0,-5,-1,3, 0, 3 };
		int maxLen = subArray(arr, 6);
		System.out.println("maximum length of subArray " + maxLen);
	}
}				
	
 