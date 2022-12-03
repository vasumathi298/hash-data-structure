package hashing;
import java.util.Map;
import java.util.HashMap;

public class ItineryFromListOfTickets {

	public static void itineryFromListOfTickets(Map<String, String> dataset) {
		String starting=null;
		for(Map.Entry<String,String> entry:dataset.entrySet()) {
			String key=entry.getKey();
			if(dataset.containsValue(key))
				continue;
			else {
				starting=entry.getKey();	
				break;
			}
		}
		while(starting!=null && dataset.get(starting)!=null) {
			System.out.println(starting+" -> "+ dataset.get(starting));
			starting=dataset.get(starting);
		}
	}
	 public static void main(String[] args)
	    {
	        Map<String, String> dataSet = new HashMap<String, String>();
	        dataSet.put("Chennai", "Banglore");
	        dataSet.put("Bombay", "Delhi");
	        dataSet.put("Goa", "Chennai");
	        dataSet.put("Delhi", "Goa");
	 
	        itineryFromListOfTickets(dataSet);
	    }
}
