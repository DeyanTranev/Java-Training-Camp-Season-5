package warehouse;

import java.util.Arrays;
import java.util.List;

public class Client implements Runnable{

	private Shop shop;
	
	
	@Override
	public void run() {
		List<Product> shoppingList = Arrays.asList(
		new Product("Pork", ProductType.MEATS),
		new Product("Cucumber", ProductType.VEGETABLES),
		new Product("Banana", ProductType.FRUITS));
		while(true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return;
			}
			System.out.println("Time to shop");
			try {
				Product randomProduct = shoppingList.get((int)Math.random() * shoppingList.size());
				int randomQuantity = (int)(Math.random() * 3)+1;
				shop.sellProduct(randomProduct, randomQuantity);
				System.out.println("Bought "+randomProduct+" - time to eat");
			} catch (WarehouseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


	public Shop getShop() {
		return shop;
	}


	public void setShop(Shop shop) {
		this.shop = shop;
	}

	

}
