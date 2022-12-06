package hashing;

import java.util.HashMap;
import java.util.Map;

public class MaxPossibleDiffBetweenSubsets {

	public static int maxDiff(int[] arr) {
		int diff=0;
		HashMap<Integer,Integer> hash_pos=new HashMap<Integer,Integer>();
		HashMap<Integer,Integer> hash_neg=new HashMap<Integer,Integer>();
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>0) {
				if(hash_pos.containsKey(arr[i]))
					hash_pos.put(arr[i], hash_pos.get(arr[i]));
				else
					hash_pos.put(arr[i], 1);
			}
		}
		for(int i =0;i<arr.length;i++) {
			if(arr[i]<0) {
				if(hash_neg.containsKey(arr[i]))
					hash_pos.put(arr[i], hash_neg.get(arr[i]));
				else
					hash_neg.put(arr[i], 1);
			}
		}
		int subset_pos=0, subest_neg=0;
		for(Map.Entry<Integer, Integer> e:hash_pos.entrySet()) {
			if(e.getValue()==1)
				subset_pos=subset_pos+e.getKey();		
		}
		for(Map.Entry<Integer, Integer> e:hash_neg.entrySet()) {
			if(e.getValue()==1)
				subest_neg=subest_neg+e.getKey();
				
		}
		return (subset_pos-subest_neg);
	}
	public static void main(String[] args)
	{
	  int arr[] = {4, 2, -3, 3,
	               -2, -2, 8};
	  System.out.print("Maximum Difference = " +
	                    maxDiff(arr));
	}
}
