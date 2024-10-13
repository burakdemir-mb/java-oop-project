package oopWithNLayeredAppDemo.business;

import java.util.HashSet;
import java.util.Set;

import oopWithNLayeredAppDemo.core.logging.Logger;
import oopWithNLayeredAppDemo.dataAccess.ICourseDao;
import oopWithNLayeredAppDemo.entities.Course;

public class CourseManager {

	private ICourseDao courseDao;
	private Logger[] loggers;
	private Set<String> courses;

	public CourseManager(ICourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = new HashSet<String>();
	}

	public void add(Course course) throws Exception {
		if (course.getCoursePrice() < 0) {
			throw new Exception("Course price can not be smaller than 0.");
		}

		if (courses.contains(course.getCourseName())) {
			throw new Exception("This course already exists : " + course.getCourseName());
		}

		courseDao.add(course);
		courses.add(course.getCourseName());

		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
	}

}
