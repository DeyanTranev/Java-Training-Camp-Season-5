package instruments;

public class Instrument {
	
	private String name;
	private InstrumentType type;
	private int price;
	private int unitsAvailable;
	private int unitsSold;
	
	private Object lock;

	public Object getLock() {
		return lock;
	}

	public Instrument(String name, InstrumentType type, int price) {
		if (name != null && !name.equals("")) {
			this.name = name;
		}
		this.type = type;
		if (price > 0) {
			this.price = price;
		}
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price > 0) {
			this.price = price;
		}
	}

	public String getName() {
		return name;
	}

	public InstrumentType getType() {
		return type;
	}

	public int getUnitsAvailable() {
		return unitsAvailable;
	}

	public void setUnitsAvailable(int unitsAvailable) {
		if (unitsAvailable > 0) {
			this.unitsAvailable = unitsAvailable;
		}
	}
	
	public int getUnitsSold() {
		return unitsSold;
	}

	public void setUnitsSold(int unitsSold) {
		if (unitsSold > this.unitsSold) {
			this.unitsSold = unitsSold;
		}
	}

	@Override
	public String toString() {
		return "Instrument [name=" + name + ", type=" + type + ", price=" + price + ", unitsAvailable=" + unitsAvailable
				+", unitsSold "+unitsSold+ "]";
	}


}
