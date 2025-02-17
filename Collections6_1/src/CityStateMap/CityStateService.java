package CityStateMap;

import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
import java.util.HashSet;

public class CityStateService {
	private HashMap<String, String> cs = new HashMap<>();
	
	public void addCityState(String city, String state) {
		cs.put(city, state);
		System.out.println("Successfully added");
	}
	
	public Set<String> getAllCities() {
		return cs.keySet();
	}
	
	public Set<String> getAllStates() {
		return new HashSet<>(cs.values());
	}
	
	public void deleteCitiesForState(String state) {
	    Iterator<Map.Entry<String, String>> iterator = cs.entrySet().iterator();
	    while (iterator.hasNext()) {
	        HashMap.Entry<String, String> entry = iterator.next();
	        if (entry.getValue().equalsIgnoreCase(state)) {
	            iterator.remove();
	        }
	    }
	    System.out.println("Deleted all cities of the state: " + state);
	}
	
	public void display() {
        for (Map.Entry<String, String> entry : cs.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
	
}
