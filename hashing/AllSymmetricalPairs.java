package hashing;
import java.util.HashMap;

public class AllSymmetricalPairs {

	public static void findSymPairs(int [][] arr) {
		
		HashMap<Integer, Integer> hashMap=new HashMap<Integer,Integer>();
		for(int i =0;i< arr.length;i++) {
			int one=arr[i][0];
			int two=arr[i][1];
			Integer first=hashMap.get(two);
			
			if(first!=null && first == one)
				System.out.println("("+one+","+two+")");
			else
				hashMap.put(one, two);
		}
	}
	public static void main(String[] args) {
		int arr[][] = new int[5][2];
        arr[0][0] = 11; arr[0][1] = 20;
        arr[1][0] = 30; arr[1][1] = 40;
        arr[2][0] = 5;  arr[2][1] = 10;
        arr[3][0] = 40;  arr[3][1] = 30;
        arr[4][0] = 10;  arr[4][1] = 5;
        findSymPairs(arr);
	}
}
