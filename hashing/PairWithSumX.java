package hashing;
import java.util.HashSet;

public class PairWithSumX {
	
	public static boolean isPairWithSumXAvailableInArray(int [] arr, int sum) {
		HashSet<Integer> hash= new HashSet<Integer>();
		for(int i =0;i<arr.length;i++) {
			int temp=sum-arr[i];
			if(hash.contains(temp))
			{
				return true;
			}
			hash.add(arr[i]);
		}
		return false;
	}
	public static void main(String[] args) {
		int[] arr2= {2,3,4,5,6,7,6};
		int sum=12;
		System.out.print(isPairWithSumXAvailableInArray(arr2,sum));
	}

}
