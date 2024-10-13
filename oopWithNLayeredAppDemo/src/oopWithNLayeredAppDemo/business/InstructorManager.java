package oopWithNLayeredAppDemo.business;

import java.util.HashSet;
import java.util.Set;

import oopWithNLayeredAppDemo.core.logging.Logger;
import oopWithNLayeredAppDemo.dataAccess.IInstructorDao;
import oopWithNLayeredAppDemo.entities.Instructor;

public class InstructorManager {

	private IInstructorDao instructorDao;
	private Logger[] loggers;
	private Set<String> instructors;

	public InstructorManager(IInstructorDao instructorDao, Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
		this.instructors = new HashSet<String>();
	}

	public void add(Instructor instructor) throws Exception {
		if (instructors.contains(instructor.getFirstName() + " " + instructor.getLastName())) {
			throw new Exception("The instructor already exists : " + instructor.getFirstName() + " " + instructor.getLastName());
		}

		instructorDao.add(instructor);
		instructors.add(instructor.getFirstName() + " " + instructor.getLastName());

		for (Logger logger : loggers) {
			logger.log(instructor.getFirstName() + " " + instructor.getLastName());
		}
	}

}
