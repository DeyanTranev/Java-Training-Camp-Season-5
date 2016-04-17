package instruments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MusicShop {

	private Map<String, Instrument> inventar;
	private int money;
	private int salesRevenue;
	private Supplier sup;
	
	
	public MusicShop() {
		inventar = new HashMap<String, Instrument>();
	}
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		if (money > 0) {
			this.money = money;
		}
	}
	
	public Object getInstrumentLock(String name) {
		return inventar.get(name).getLock();
	}
	boolean sellInstrument(String name, int amount) {
		if (inventar.containsKey(name) && inventar.get(name).getUnitsAvailable()>=amount) {
			int newAvailable = inventar.get(name).getUnitsAvailable()-amount;
			inventar.get(name).setUnitsAvailable(newAvailable);
			int newSold = inventar.get(name).getUnitsSold()+amount;
			inventar.get(name).setUnitsSold(newSold);
			this.money += inventar.get(name).getPrice()*amount;
			return true;
		}
		else {
			System.out.println(amount + " units of "+name +" are not available.");
			
			return false;
			
		}
	}
	
	void sellByOrder(String name, int amount) {
		OrderFromSupplier order = new OrderFromSupplier(name);
		
		
	}
	private class OrderFromSupplier implements Runnable {
		
		private String instrumentName;
		public OrderFromSupplier(String name) {
			this.instrumentName =  name;
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			long timeToWait = sup.supply(instrumentName);
			try {
				Thread.sleep(timeToWait);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	void stockInstrument(String name, InstrumentType type, int price, int amount) {
		if (!inventar.containsKey(name)) {
			inventar.put(name, new Instrument(name, type, price));
		}
		int newAvailable = inventar.get(name).getUnitsAvailable()+amount;
		inventar.get(name).setUnitsAvailable(newAvailable);
	}
	
	
	
	List<Instrument> listInstruments (String byWhat) {
		List<Instrument> sortedBy = new ArrayList<Instrument>();
		sortedBy.addAll(inventar.values());
		if (byWhat.equals("type")) {
			Collections.sort(sortedBy, (ins1, ins2) -> 
			ins1.getType().compareTo(ins2.getType()));
		}
		if (byWhat.equals("name")) {
			Collections.sort(sortedBy, (ins1, ins2) -> 
			ins1.getName().compareTo(ins2.getName()));
		}
		if (byWhat.equals("price")) {
			Collections.sort(sortedBy, (ins1, ins2) -> 
			ins1.getPrice()-ins2.getPrice());
		}
		if (byWhat.equals("priceDescending")) {
			Collections.sort(sortedBy, (ins1, ins2) -> 
			ins2.getPrice()-ins1.getPrice());
		}
		printReport(sortedBy);
		return sortedBy;
	}
	
	
	void shopReport(String what) {
		List<Instrument> reported = new ArrayList<Instrument>();
		for (String name: inventar.keySet()) {
			reported.add(inventar.get(name));
		}
		if (what.equals("sales")) {
			Collections.sort(reported, (ins1, ins2) -> 
			ins2.getUnitsSold()-ins1.getUnitsSold());
			printReport(reported);
		}
		if (what.equals("revenue")) {
			System.out.println(this.money);
		}
		if (what.equals("most sold")) {
			Collections.sort(reported, (ins1, ins2) -> 
			ins2.getUnitsSold()-ins1.getUnitsSold());
			System.out.println(reported.get(0));
			int index = 0;
			while(index+1 < reported.size() && reported.get(index).getUnitsSold()==reported.get(index+1).getUnitsSold()) {
				System.out.println(reported.get(index+1));
				index++;
			}
		}
		if (what.equals("least sold")) {
			Collections.sort(reported, (ins1, ins2) -> 
			ins1.getUnitsSold()-ins2.getUnitsSold());
			System.out.println(reported.get(0));
			int index = 0;
			while(index+1 < reported.size() && reported.get(index).getUnitsSold()==reported.get(index+1).getUnitsSold()) {
				System.out.println(reported.get(index+1));
				index++;
			}
		}
		if (what.equals("type sales")) {
			Map<InstrumentType, Integer> byType = new HashMap<InstrumentType, Integer>();
			for (String name: inventar.keySet()) {
				if (!byType.containsKey(inventar.get(name).getType())) {
					byType.put(inventar.get(name).getType(),inventar.get(name).getUnitsSold());
				}
				else {
				int unitsSold=inventar.get(name).getUnitsSold();
				byType.put(inventar.get(name).getType(), byType.get(inventar.get(name).getType())+unitsSold);
				}
			}
			List<InstrumentType> sortedByTypeAndSales = new ArrayList<InstrumentType>();
			for (Map.Entry<InstrumentType, Integer> entry: byType.entrySet()) {
				sortedByTypeAndSales.add(entry.getKey());
			}
			Collections.sort(sortedByTypeAndSales, (type1, type2) -> 
			byType.get(type2)-byType.get(type1));
			System.out.println(sortedByTypeAndSales.get(0)+" "+byType.get(sortedByTypeAndSales.get(0)));
			
			//Instead of sorting, loop through the map to get the max value and the type corresponding
		}
		if (what.equals("type revenue")) {
			Map<InstrumentType, Integer> byType = new HashMap<InstrumentType, Integer>();
			for (String name: inventar.keySet()) {
				if (!byType.containsKey(inventar.get(name).getType())) {
					byType.put(inventar.get(name).getType(),inventar.get(name).getUnitsSold()*inventar.get(name).getPrice());
				}
				else {
				int typeRevenue=inventar.get(name).getUnitsSold()*inventar.get(name).getPrice();
				byType.put(inventar.get(name).getType(), byType.get(inventar.get(name).getType())+typeRevenue);
				}
			}
			List<InstrumentType> sortedByTypeAndRevenue = new ArrayList<InstrumentType>();
			for (Map.Entry<InstrumentType, Integer> entry: byType.entrySet()) {
				sortedByTypeAndRevenue.add(entry.getKey());
			}
			Collections.sort(sortedByTypeAndRevenue, (type1, type2) -> 
			byType.get(type2)-byType.get(type1));
			System.out.println(sortedByTypeAndRevenue.get(0)+" "+byType.get(sortedByTypeAndRevenue.get(0)));
			
		}
	}

	private void printReport(List<Instrument> reported) {
		for (Instrument ins: reported) {
			System.out.println(ins);
		}
	}
	

}
