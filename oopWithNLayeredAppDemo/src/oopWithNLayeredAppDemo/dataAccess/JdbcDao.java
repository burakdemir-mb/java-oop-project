package oopWithNLayeredAppDemo.dataAccess;

import oopWithNLayeredAppDemo.entities.Category;
import oopWithNLayeredAppDemo.entities.Course;
import oopWithNLayeredAppDemo.entities.Instructor;

public class JdbcDao implements ICategoryDao, ICourseDao, IInstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Instructor added in database using JDBC : " + instructor.getFirstName() + " " + instructor.getLastName());
	}

	@Override
	public void add(Course course) {
		System.out.println("Course added in database using JDBC : " + course.getCourseName());

	}

	@Override
	public void add(Category category) {
		System.out.println("Category added in database using JDBC : " + category.getCategoryName());

	}

}
