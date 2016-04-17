package warehouse;

public interface IPlaceOfBusiness {

	void addProduct(Product product, int quantity) throws WarehouseException;

	void sellProduct(Product product, int quantity) throws WarehouseException;

	boolean needRestock();

}