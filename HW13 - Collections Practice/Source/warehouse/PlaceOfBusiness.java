package warehouse;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//Niki, pisal sym koda zaedno s teb ot videoto, za da si go obqsnq,no sam ot nachalo ne se poluchava.

public abstract class PlaceOfBusiness implements IPlaceOfBusiness, Runnable {
	private static final int INITIAL_STOCK = 15;
	private static final int LOW_STOCK = 5;
	private Map<Product, Integer> products = new ConcurrentHashMap<Product, Integer>();
	
	public PlaceOfBusiness() {
		
		for (String productName: new String[]{"Banana", "Apple", "Orange"}) {
			products.put(new Product(productName, ProductType.FRUITS), INITIAL_STOCK);
		}
		for (String productName: new String[]{"Potato", "Eggplant", "Cucumber"}) {
			products.put(new Product(productName, ProductType.VEGETABLES), INITIAL_STOCK);
		}
		for (String productName: new String[]{"Pork", "Beef", "Chicken"}) {
			products.put(new Product(productName, ProductType.MEATS), INITIAL_STOCK);
		}
	}
	/* (non-Javadoc)
	 * @see warehouse.IPlaceOfBusiness#addProduct(warehouse.Product, int)
	 */
	@Override
	public void addProduct(Product product, int quantity) throws WarehouseException {
		if (product != null && quantity >0 && products.containsKey(product)) {
			int newQuantity = products.get(product);
			newQuantity += quantity;
			products.put(product, newQuantity);
			synchronized(products) {
				products.notify();
			}
		}
		else {
			throw new WarehouseException("Incorrectly passed product");
		}
	}
	
	private boolean canIBuyThisProduct(Product product, int quantity) {
		return products.get(product) >= quantity;
	}
	
	/* (non-Javadoc)
	 * @see warehouse.IPlaceOfBusiness#removeProduct(warehouse.Product, int)
	 */
	@Override
	public void sellProduct(Product product, int quantity) throws WarehouseException {
		if (product != null && quantity >0 && products.containsKey(product)) {
			while (!canIBuyThisProduct(product, quantity)) {
				try {
					synchronized (products) {
						products.wait();
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return;
				}
			}
			int newQuantity = products.get(product);
			newQuantity -= quantity;
			products.put(product, newQuantity);
		}
		else {
			throw new WarehouseException("Incorrectly passed product");
		}
	}
	
	public List<Product> getLowStockProducts () {
		List<Product> lowStockProducts = new ArrayList<Product>();
		for (Product product: products.keySet()) {
			if (products.get(product) < LOW_STOCK) {
				lowStockProducts.add(product);
			}
		}
		
		return lowStockProducts;
	}
	
	
}
