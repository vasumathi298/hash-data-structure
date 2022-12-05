package hashing;

import java.util.HashMap;

public class CountSubArraySumEqualsX {
	
	public static int findSubarraySum(int[] arr, int sum) {
		int count=0;
		int curr_sum=0;
		HashMap<Integer,Integer> hash=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++) {
			curr_sum=curr_sum+arr[i];
			if(curr_sum== sum)
				count=count+1;
			if(hash.containsKey(curr_sum-sum))
				count=count+hash.get(curr_sum-sum);
			hash.put(curr_sum, hash.getOrDefault(curr_sum,0)+1);
		}
		return count;
	}
	public static void main(String[] args) {
		int arr[] = {9, 4, 20, 3, 10, 5};
        int sum = 33;
        System.out.println(findSubarraySum(arr, sum));
	}

}
