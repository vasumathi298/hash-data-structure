package hashing;
import java.util.HashSet;

public class ProductResultExistsInArray {

	public static int countProductResultExistsInArray(int[] arr) {
		int count=0;
		HashSet<Integer> hash=new HashSet<Integer>();
		
		for(int i =0;i<arr.length;i++) {
			hash.add(arr[i]);
		}
		for(int i =0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int product=arr[i]*arr[j];
				if(hash.contains(product))
					count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int [] arr= {6,2,3,12,4};
		System.out.println(countProductResultExistsInArray(arr));
	}
}
