package classes2;

public class Main {

	public static void main(String[] args) {		
		Product product = new Product(1, "Laptop", "Asus Laptop", 5000, 3, "Black");
		
		Product product2 = new Product();
		product2.setName("Monitor");
		product2.setId(2);
		product2.setDescription("Lenovo-G24");
		product2.setPrice(4000);
		product2.setStockAmount(12);

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		productManager.Add(product2);

		System.out.println(product.getCode());
		System.out.println(product2.getCode());
	}

}
