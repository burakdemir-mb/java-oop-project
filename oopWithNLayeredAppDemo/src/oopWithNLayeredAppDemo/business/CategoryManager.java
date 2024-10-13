package oopWithNLayeredAppDemo.business;

import java.util.HashSet;
import java.util.Set;

import oopWithNLayeredAppDemo.core.logging.Logger;
import oopWithNLayeredAppDemo.dataAccess.ICategoryDao;
import oopWithNLayeredAppDemo.entities.Category;

public class CategoryManager {

	private ICategoryDao categoryDao;
	private Logger[] loggers;
	private Set<String> categories;

	public CategoryManager(ICategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = new HashSet<String>();
	}

	public void add(Category category) throws Exception {
		if (categories.contains(category.getCategoryName())) {
			throw new Exception("This category already exists : " + category.getCategoryName());
		}

		categoryDao.add(category);
		categories.add(category.getCategoryName());

		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}
	}

}
