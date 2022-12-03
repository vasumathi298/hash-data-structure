package hashing;
import java.util.HashSet;

public class CountSubsetsWithDistinctEvenNumbers {

	public  static int countSubsetsWithDistinctEvenNumbers(int[] arr) {
		HashSet<Integer> hash=new HashSet<Integer>();
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)
				hash.add(arr[i]);
		}
		count=hash.size();
		return (int)(Math.pow(2,count) -1);
	}
	public static void main(String[] args) {
		 int arr[] = {10, 3, 4, 2, 4, 20, 10, 6, 8, 14, 2, 6, 9};
		 System.out.println(countSubsetsWithDistinctEvenNumbers(arr));
	}
}
