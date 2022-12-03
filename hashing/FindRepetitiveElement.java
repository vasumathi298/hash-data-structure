package hashing;

import java.util.HashSet;
public class FindRepetitiveElement {

	public static int findRepetitiveElement(int[] arr) {
		HashSet<Integer> hash=new HashSet<Integer>();
		for (int i =0;i<arr.length;i++) {
			if(hash.contains(arr[i]))
				return arr[i];
			else
				hash.add(arr[i]);
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,4,4,5};
		System.out.println(findRepetitiveElement(arr));
		
	}
}
