package warehouse;

import java.util.List;

public class Shop extends PlaceOfBusiness implements Runnable  {

	private Warehouse warehouse;
	private static final int RESTOCK_QUANTITY = 5;
	
	public Shop() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean needRestock() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void run() {
		List<Product> products = getLowStockProducts();
		if (products.size() > 0) {
			for (Product product : products) {
				try {
					warehouse.sellProduct(product, RESTOCK_QUANTITY);
				} catch (WarehouseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
