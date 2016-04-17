package instruments;

public class Demo {

	public static void main(String[] args) throws MusicException {
		// TODO Auto-generated method stub
		MusicShop jr = new MusicShop();
		
		Instrument ins1 = new Instrument("kitara",InstrumentType.Strunni, 200);
		Instrument ins2 = new Instrument("cimbal",InstrumentType.Udarni, 150);
		Instrument ins3 = new Instrument("tyrnokop",InstrumentType.Udarni, 50);
		Instrument ins4 = new Instrument("oboi",InstrumentType.Duhovi, 350);
		Instrument ins5 = new Instrument("sintezator", InstrumentType.Elektronni, 1000);
		
		jr.stockInstrument("kitara",InstrumentType.Strunni, 200, 5);
		jr.stockInstrument("cimbal",InstrumentType.Udarni, 150, 4);
		jr.stockInstrument("tyrnokop", InstrumentType.Udarni, 50, 9);
		jr.stockInstrument("oboi", InstrumentType.Duhovi, 350, 7);
		jr.stockInstrument("sintezator", InstrumentType.Elektronni, 1000, 2);
		
		jr.sellInstrument("kitara", 4);
		jr.sellInstrument("oboi", 2);
		jr.sellInstrument("tyrnokop", 4);
		jr.sellInstrument("cimbal", 2);
		
		jr.listInstruments("priceDescending");
		System.out.println();
		jr.shopReport("type revenue");
	}

}
