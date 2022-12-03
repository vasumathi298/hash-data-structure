package hashing;
import java.util.HashMap;
import java.util.Map;

public class MostFrequent {
	
	public static int mostFrequent(int[] arr) {
		HashMap<Integer,Integer> hash=new HashMap<Integer, Integer>();
		for(int i =0;i<arr.length;i++) {
			if(hash.containsKey(arr[i]))
				hash.put(arr[i], hash.get(arr[i])+1);
			else
				hash.put(arr[i], 1);
		}
		int max=0;
		int key=Integer.MIN_VALUE;
		for(Map.Entry<Integer,Integer> entry:hash.entrySet()) {
			if(entry.getValue()>max) {
				max=Math.max(max, entry.getValue());
				key=entry.getKey();
			}
		}
		return key;

	}
	public static void main(String[] args) {
		int [] arr= {2,3,4,4,4,4,4,4,4,4,4,4,4,2,2,2,2};
		System.out.print(mostFrequent(arr));
	}

}
