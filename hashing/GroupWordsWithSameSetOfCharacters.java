package hashing;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
public class GroupWordsWithSameSetOfCharacters {

	public static String getKey(String word) {
		LinkedHashSet<Character> charhash=new LinkedHashSet<Character>();
		for(int i=0;i<word.length();i++)
			charhash.add(word.charAt(i));
		String key="";
        ArrayList<Character> elements = new ArrayList<>(charhash);
        Collections.sort(elements);
		for(int i=0;i<elements.size();i++)
			key=key+elements.get(i);
        //System.out.println(word+ " "+ key );

		return key;
	}
	public static void wordsWithSameCharSet(String[] words) {
	
		HashMap<String,ArrayList<Integer>> hash=new HashMap<String,ArrayList<Integer>>();
		for(int i =0;i<words.length;i++) {
			String key=getKey(words[i]);
			if(hash.containsKey(key)) {
				ArrayList<Integer> list= hash.get(key);
				list.add(i);
				hash.put(key, list);
			}
			else {
				ArrayList<Integer> list=new ArrayList<Integer>();
				list.add(i);
				hash.put(key, list);
			}
		}
		for(Map.Entry<String, ArrayList<Integer>> entry: hash.entrySet()) {
			ArrayList<Integer> list=entry.getValue();
			for(Integer i:list)
				System.out.print(words[i]+" ");
			System.out.println(" ");

			
		}
	}
	public static void main(String args[])
    {
        String words[] = { "may", "student", "students", "dog",
                     "studentssess", "god", "cat", "act", "tab",
                     "bat", "flow", "wolf", "lambs", "amy", "yam",
                     "balms", "looped", "poodle"};
        wordsWithSameCharSet(words);
    }
}
