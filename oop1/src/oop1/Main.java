package oop1;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.url");

		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(10);
		product2.setUnitPrice(6550);
		product2.setUnitsInStock(2);
		product2.setImageUrl("image2.url");

		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(8);
		product3.setUnitPrice(4350);
		product3.setUnitsInStock(4);
		product3.setImageUrl("image2.url");

		Product[] products = { product1, product2, product3 };

		for (Product product : products) {
			System.out.println(product.getName());
		}

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("055555234");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Burak");
		individualCustomer.setLastName("Demir");

		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("0523423412");
		corporateCustomer.setTaxNumber("12345678910");
		corporateCustomer.setCompanyName("54321");

		Customer[] customers = { individualCustomer, corporateCustomer };
	}

}
