package oopWithNLayeredApp.dataAccess;
//Data Access Object, Data Access Layer, PHP Data Object

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
	public void add(Product product) {
		// this block contains only data access codes... SQL
		System.out.println("Added to database using JDBC");
	}
}
