package hashing;
import java.util.HashSet;

public class PairOfPosAndNeg {
	
	public static void pairOfPosAndNeg(int[] arr) {
		HashSet<Integer> hash=new HashSet<Integer>();
		for(int i =0;i<arr.length;i++) {
			if(hash.contains(arr[i]*-1)|| hash.contains(arr[i])) {
				if(arr[i]< 0)
					System.out.println(arr[i]+","+(-1*arr[i]));
				else
					System.out.println((-1*arr[i])+","+arr[i]);
			}
			else {
				hash.add(arr[i]);
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = { 7,9,5,3,-7,-3,-5 };
		pairOfPosAndNeg(arr);
	
	}

}
