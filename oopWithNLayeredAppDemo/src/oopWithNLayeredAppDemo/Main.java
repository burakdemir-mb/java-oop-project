package oopWithNLayeredAppDemo;

import oopWithNLayeredAppDemo.business.CategoryManager;
import oopWithNLayeredAppDemo.business.CourseManager;
import oopWithNLayeredAppDemo.business.InstructorManager;
import oopWithNLayeredAppDemo.core.logging.DatabaseLogger;
import oopWithNLayeredAppDemo.core.logging.FileLogger;
import oopWithNLayeredAppDemo.core.logging.Logger;
import oopWithNLayeredAppDemo.core.logging.MailLogger;
import oopWithNLayeredAppDemo.dataAccess.HibernateDao;
import oopWithNLayeredAppDemo.dataAccess.JdbcDao;
import oopWithNLayeredAppDemo.entities.Category;
import oopWithNLayeredAppDemo.entities.Course;
import oopWithNLayeredAppDemo.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		Logger[] loggers = new Logger[] { new DatabaseLogger(), new FileLogger(), new MailLogger() };

		Instructor instructor1 = new Instructor(1, "Engin", "Demirog", "55555555", "email@mail.com");
		Instructor instructor2 = new Instructor(2, "Engin", "Yilmaz", "00000000", "email2@mail.com");
		// Instructor instructor3 = new Instructor(3, "Engin", "Demirog", "55555444", "email3@mail.com");

		InstructorManager instructorManager = new InstructorManager(new HibernateDao(), loggers);
		instructorManager.add(instructor1);
		instructorManager.add(instructor2);
		// instructorManager.add(instructor2);

		Course course1 = new Course(1, "C Programming", 150);
		Course course2 = new Course(2, "Java Programming", 200);
		// Course course3 = new Course(3, "C Programming", 200);

		CourseManager courseManager = new CourseManager(new JdbcDao(), loggers);
		courseManager.add(course1);
		// courseManager.add(course2);

		Category category1 = new Category(1, "Science");
		Category category2 = new Category(2, "Level Design");
		// Category category3 = new Category(3, "Science");

		CategoryManager categoryManager = new CategoryManager(new HibernateDao(), loggers);
		categoryManager.add(category1);
		// categoryManager.add(category2);
	}

}
