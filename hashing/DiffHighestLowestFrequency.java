package hashing;

import java.util.HashMap;
import java.util.Map;

public class DiffHighestLowestFrequency {

	public static int diffHighestLowestFrequency(int[] arr) {
		HashMap<Integer,Integer> hash=new HashMap<Integer,Integer>();
		for(int i =0;i<arr.length;i++) {
			if(hash.containsKey(arr[i]))
				hash.put(arr[i], hash.get(arr[i])+1);
			else
				hash.put(arr[i], 1);
		}
		int min=Integer.MAX_VALUE;
		int max= Integer.MIN_VALUE;
		for(Map.Entry<Integer,Integer> entry:hash.entrySet()) {
			min=Math.min(min,entry.getValue() );
			max=Math.max(max, entry.getValue() );
		}
		return max-min;
	}
	public static void main(String[] args) {
		int arr[] = { 7, 8, 4, 5, 4, 1, 1, 7, 7, 2, 5 };
		System.out.println(diffHighestLowestFrequency(arr));
	}
}
