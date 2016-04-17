package warehouse;

import java.util.List;

public class Supplier implements Runnable{
	private static final int DEFAULT_SUPPLY_QUANTITY = 25;
	private Warehouse warehouse;

	@Override
	public void run() {
		while(true) {
			List<Product> products = warehouse.getLowStockProducts();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Supplied with: "+products);
			
			for(Product product: products) {
				try {
					warehouse.addProduct(product, DEFAULT_SUPPLY_QUANTITY);
				} catch (WarehouseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
}
