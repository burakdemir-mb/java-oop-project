package staticDemo;

public class ProductManager {
	public void add(Product product) {
		// ProductValidator validator = new ProductValidator();
		if (ProductValidator.isValid(product)) {
			System.out.println("Product added.");
		} else {
			System.out.println("Product data is invalid.");
		}
	}
}
