package hashing;

import java.util.HashMap;

public class CountPairWithGivenSum {

	public static int countPairWithGivenSum(int[] arr, int sum) {
		HashMap<Integer,Integer> hash=new HashMap<Integer,Integer>();
		int count=0;
		for(int i =0;i<arr.length;i++) {
			if(hash.containsKey(sum-arr[i]))
				count=count+ hash.get(sum-arr[i]);
			else if (hash.containsKey(arr[i]))
				 hash.put(arr[i], hash.get(arr[i]) + 1);
			else
				hash.put(arr[i], 1);
		}
		return count;
		
		
	}
	public static void main(String[] args)
    {
		int arr[] = { 1, 5, 7, -1, 5 };
        int sum = 6;
        System.out.println(countPairWithGivenSum(arr,sum));
    }
}
