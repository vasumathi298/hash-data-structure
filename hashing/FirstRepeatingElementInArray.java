package hashing;

import java.util.HashSet;

public class FirstRepeatingElementInArray {

	public static void firstRepeatingElementInArray(int[] arr) {
		HashSet <Integer> hash=new HashSet<Integer>();
		int min=Integer.MIN_VALUE;
		for(int i =arr.length-1;i>=0;i--) {
			if(hash.contains(arr[i]))
				min=i;
			else
				hash.add(arr[i]);
		}
		if(min!=Integer.MIN_VALUE)
			System.out.print(arr[min]);
		else
			System.out.print(-1);
	}
	public static void main(String[] args) {
		int[] arr = { 9,5,3,3,3,7,-5,9, 0};
		firstRepeatingElementInArray(arr);
	
	}
}
