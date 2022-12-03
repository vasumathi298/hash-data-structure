package hashing;

import java.util.HashMap;
import java.util.Map;

public class MinInsertsForPalindrome {
	
	public static int minInsertionForPalindrome(String str) {
		HashMap<Character, Integer> hashMap=new HashMap<Character, Integer>();
		for(int i =0;i<str.length();i++) {
			if(hashMap.containsKey(str.charAt(i)))
				hashMap.put(str.charAt(i), hashMap.get(str.charAt(i))+1);
			else
				hashMap.put(str.charAt(i), 1);
		}
		int count=0;
		for(Map.Entry<Character,Integer> entry:hashMap.entrySet()) {
			if(entry.getValue()%2 == 1)
				count=count+1;
		}
		if(count == 0)
			return 0;
		else
			return count-1;
		
	}
	public static void main(String[] args)
    {
        String str = "vasumathi";
        System.out.println(minInsertionForPalindrome(str));
    }
}
