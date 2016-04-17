package instruments;

import java.util.HashMap;
import java.util.Map;

public class Supplier {
	private Map<String, Long> catalog;
	
	public Supplier() {
		catalog = new HashMap<String, Long>();
		
	}
	
	public void addToCatalog(String name, long milis) {
		catalog.put(name, milis);
	}
	
	public long supply(String name) {
		return catalog.get(name);
	}
}
