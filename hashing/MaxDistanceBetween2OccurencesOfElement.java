package hashing;
import java.util.HashMap;

public class MaxDistanceBetween2OccurencesOfElement {
	
	public static int maxDistanceBetween2OccurencesOfElement(int[] arr) {
		HashMap<Integer, Integer> hashMap=new HashMap<Integer,Integer>();
		int max_distance=0;
		for(int i =0;i<arr.length;i++) {
			if(!hashMap.containsKey(arr[i]))
				hashMap.put(arr[i], i);
			else
				max_distance=Math.max(max_distance, i-hashMap.get(arr[i]));
		}
		return max_distance;
	}
	public static void main(String[] args) {
		int[] arr= {2,4,4,5,4,3,3,3,2,2,2343,4,3,2};
		System.out.print(maxDistanceBetween2OccurencesOfElement(arr));
		
	}

}
