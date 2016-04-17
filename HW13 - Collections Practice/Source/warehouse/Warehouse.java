package warehouse;


public class Warehouse extends PlaceOfBusiness {

	
	@Override
	public boolean needRestock() {
		return !getLowStockProducts().isEmpty();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sellProduct(Product product, int quantity) throws WarehouseException {
		// TODO Auto-generated method stub
		
	}


}
