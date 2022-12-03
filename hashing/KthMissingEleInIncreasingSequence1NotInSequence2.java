package hashing;
import java.util.HashSet;

public class KthMissingEleInIncreasingSequence1NotInSequence2 {

	public static int kthMissingEleInIncreasingSequence1NotInSequence2(int[]a , int[]b, int k) {
		int count=0;
		HashSet<Integer> hash=new HashSet<Integer>();
		for(int i =0;i<b.length;i++)
			hash.add(b[i]);
		for(int i =0;i< a.length;i++) {
			if(!hash.contains(a[i])) {
				count=count+1;
				if(count == k)
					return a[i];
			}
				
		}
		return -1;
	}
	public static void main(String[] args) {
		int a[] = { 0, 2, 4, 6, 8, 10, 12, 14, 15 };
	    int b[] = { 4, 10, 6, 8, 12 };
	    int k=3;
	    System.out.print( kthMissingEleInIncreasingSequence1NotInSequence2(a,b,k));
	}
}
