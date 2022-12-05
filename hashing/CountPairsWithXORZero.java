package hashing;

import java.util.HashMap;
import java.util.Map;

public class CountPairsWithXORZero {

	public static int calculate(int[] a) {
		HashMap<Integer,Integer> hash=new HashMap<Integer,Integer> ();
		for(int i =0;i<a.length;i++) {
			if(hash.containsKey(a[i]))
				hash.put(a[i], hash.get(a[i])+1);
			else
				hash.put(a[i],1);
				
		}
		int count =0;
		for(Map.Entry<Integer, Integer> e: hash.entrySet()) {
			count=count+(e.getValue()* (e.getValue()-1))/2;
		}
		return count;
	}
	public static void main(String[] args)
    {
        int a[] = {1, 2, 1, 2, 4};
       
        System.out.println(calculate(a));
    }
}
