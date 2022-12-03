package hashing;

import java.util.HashMap;
import java.util.Map;
public class MinDeleteOperationToMakeArrayElementsSame {

	public static int minDeleteOperationToMakeArrayElementsSame(int[] arr, int n) {
		HashMap<Integer, Integer> hashMap=new HashMap<Integer,Integer>();
		
		for(int i =0;i<n;i++) {
			if(hashMap.containsKey(arr[i]))
				hashMap.put(arr[i], hashMap.get(arr[i])+1);
			else
				hashMap.put(arr[i], 1);
		}
		int max=Integer.MIN_VALUE;
		for(Map.Entry<Integer, Integer> entry: hashMap.entrySet()) {
			max=Math.max(max, entry.getValue());
			
		}
		return n-max;
	}
	
	public static void main(String[] args) {
		int arr[]= {1,4,4,4,4,4};
		int n=arr.length;
		System.out.print(minDeleteOperationToMakeArrayElementsSame(arr,n));
	}

}
