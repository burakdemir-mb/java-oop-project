package oopWithNLayeredAppDemo.dataAccess;

import oopWithNLayeredAppDemo.entities.Category;
import oopWithNLayeredAppDemo.entities.Course;
import oopWithNLayeredAppDemo.entities.Instructor;

public class HibernateDao implements ICategoryDao, ICourseDao, IInstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Instructor added in database using Hibernate : " + instructor.getFirstName() + " " + instructor.getLastName());
	}

	@Override
	public void add(Course course) {
		System.out.println("Course added in database using Hibernate : " + course.getCourseName());
	}

	@Override
	public void add(Category category) {
		System.out.println("Category added in database using Hibernate : " + category.getCategoryName());
	}

}
