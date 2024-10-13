package classes2;

public class Product {
	
	public Product(int id, String name, String description, double price, int stockAmount, String color){
		System.out.println("Constructor block is running.");
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
		this.color = color;
	}
	
	public Product(){
		System.out.println("Constructor block without parameter is running.");
	}

	// attribute | field
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String color;
	private String code;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCode() {
		return this.name.substring(0, 2).toUpperCase() + "-" + id;
	}

	/*
	 * private int _id;
	 * 
	 * //getter
	 * public int getId() {
	 *  	return _id; 
	 *  
	 *  }
	 * 
	 * //setter
	 * public void setId(int id) {
	 * // "this" means the class we are in 
	 * 		this.id = id; 
	 * 		_id = id; 
	 * 
	 *  }
	 */
	
}
