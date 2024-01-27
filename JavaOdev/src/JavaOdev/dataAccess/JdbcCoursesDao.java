package JavaOdev.dataAccess;

import JavaOdev.entites.Courses;

public class JdbcCoursesDao implements CourseDao{

	@Override
	public void Add(Courses course) {
		System.out.println("jdbc ile eklendi." + course.getCourseName() + " " + course.getAuthor());

		
	}

}
