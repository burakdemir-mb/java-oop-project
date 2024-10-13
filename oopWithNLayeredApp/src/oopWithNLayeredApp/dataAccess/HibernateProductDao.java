package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
	public void add(Product product) {
		// this block contains only data access codes... SQL
		System.out.println("Added to database using Hibernate");
	}
}
