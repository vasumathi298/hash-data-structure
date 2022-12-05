package hashing;
import java.util.HashSet;

public class CountPairs2SortedArrayEqualsSum {

	public static int countPairs(int[] arr1,int arr2[],int sum) {
		HashSet<Integer> hash=new HashSet<Integer>();
		
		int count =0;
		for(int i =0;i<arr1.length;i++)
			hash.add(arr1[i]);
		for(int i =0;i<arr2.length;i++) {
			if(hash.contains(sum-arr2[i]))
				count++;
		}
		return count;
		
	}
	public static void main(String[] args)
	{
	    int arr1[] = {1, 3, 5, 7};
	    int arr2[] = {2, 3, 5, 8};
	   
	    int x = 10;
	    System.out.print("Count = "
	        + countPairs(arr1, arr2, x));
	}
}
