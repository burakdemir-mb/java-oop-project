package staticDemo;

public class ProductValidator {

	static {
		System.out.println("Static constructor block is running.");
		// can run multiple times
	}

	public ProductValidator() {
		System.out.println("Constructor block is running.");
	}

	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
