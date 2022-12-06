package hashing;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

class CheckArrayContainsContiguousElements {

	
	public static boolean areElementsContiguous(ArrayList<Integer> arr, int n)
	{
		HashSet<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < n; ++i)
			s.add(arr.get(i));
		int set_size = s.size();
		int max = Collections.max(arr);
		int min = Collections.min(arr);

		int result = max - min + 1;
		if (result != set_size)
			return false;
		return true;
	}

	public static void main(String[] args)
	{
		ArrayList<Integer> arr = new ArrayList<Integer>(
			Arrays.asList(5, 2, 3, 6, 4, 4, 6, 6));
		int n = arr.size();
		if (areElementsContiguous(arr, n))
			System.out.print("Yes");
		else
			System.out.print("No");
	}
}

