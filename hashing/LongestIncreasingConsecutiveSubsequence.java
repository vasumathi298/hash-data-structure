package hashing;

import java.util.Collections;
import java.util.HashMap;

public class LongestIncreasingConsecutiveSubsequence {

	public static int longestIncreasingConsecutiveSubsequence(int[] arr) {
		HashMap <Integer, Integer> hash = new HashMap<>();

		for(int i =0;i<arr.length;i++) {
			if(hash.containsKey(arr[i]-1)) {
				hash.put(arr[i], hash.get(arr[i]-1)+1);
				hash.remove(arr[i]-1);
			}
			else
				hash.put(arr[i],1);
		}
		return Collections.max(hash.values());
	}
	public static void main(String[] args) {
		int arr[]={3, 10, 3, 11, 4, 5, 6, 7, 8, 12} ;
		System.out.print(		longestIncreasingConsecutiveSubsequence(arr));
	}
}
