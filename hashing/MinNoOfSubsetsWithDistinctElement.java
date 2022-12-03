package hashing;

import java.util.HashMap;
import java.util.Map;

public class MinNoOfSubsetsWithDistinctElement {
	public static int minNoOfSubsetsWithDistinctElement(int[] arr) {
		HashMap<Integer,Integer> hash=new HashMap<Integer, Integer>();
		for(int i =0;i<arr.length;i++) {
			if(hash.containsKey(arr[i]))
				hash.put(arr[i], hash.get(arr[i])+1);
			else
				hash.put(arr[i], 1);
		}
		int max=0;
		for(Map.Entry<Integer,Integer> entry:hash.entrySet()) {
			if(entry.getValue()>max) {
				max=Math.max(max, entry.getValue());
			}
		}
		return max;

	}
	public static void main(String[] args) {
		int [] arr= { 5, 6, 9, 3, 4, 3, 4 };
		System.out.print(minNoOfSubsetsWithDistinctElement(arr));
	}

}
