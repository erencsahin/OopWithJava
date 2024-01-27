package JavaOdev.dataAccess;

import JavaOdev.entites.Courses;

public class HibernateCoursesDao implements CourseDao{

	@Override
	public void Add(Courses course) {
		System.out.println("hibernate ile eklendi." + course.getCourseName() + " " + course.getAuthor());
	}

}
