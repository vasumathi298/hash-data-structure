package hashing;
import java.util.ArrayList;
import java.util.HashSet;

public class Array1SubsetOfArray2 {

	
	public static boolean isHashSet(int[] arr1, int[] arr2) {
		HashSet<Integer> hash=new HashSet<Integer>();

		for(int i =0;i<arr1.length;i++) {
			if(!hash.contains(arr1[i])) {
				hash.add(arr1[i]);
			}
		}
		for(int i =0;i<arr2.length;i++) {
			if(!hash.contains(arr2[i])) {
				return false;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		int arr1[] = { 11, 1, 13, 21, 3, 7 };
        int arr2[] = { 11, 3, 7, 1 };
        System.out.println(isHashSet(arr1,arr2));
 
		
	}
}
