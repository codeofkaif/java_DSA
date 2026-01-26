import java.util.HashMap;

public  class longSubArray{
	public  static int subArray(int[] nums , int k){
		HashMap< Integer , Integer> preSumMap = new HashMap<>();
		int sum = 0, maxLen=0;
		for(int i = 0 ; i< nums.length; i++){
			sum+=nums[i];
			if(sum == k) {
				maxLen = i+1;
			}
			if(preSumMap.containsKey(sum-k)){
				maxLen = Math.max(maxLen, i-preSumMap.get(sum-k));
			}
			if(!preSumMap.containsValue(sum)){
				preSumMap.put(sum , i);
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
				