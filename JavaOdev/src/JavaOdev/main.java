package JavaOdev;

import JavaOdev.business.CourseManager;
import JavaOdev.core.logging.DbLogger;
import JavaOdev.core.logging.FileLogger;
import JavaOdev.core.logging.Logger;
import JavaOdev.dataAccess.HibernateCoursesDao;
import JavaOdev.dataAccess.JdbcCoursesDao;
import JavaOdev.entites.Courses;

public class main {

	public static void main(String[] args) throws Exception {
		Logger[] loggers={
				new FileLogger(),
				new DbLogger()
		};
		
		Courses course1 = new Courses(1,"Java Programlama","Eren Can Şahin",300,"Yazilim Gelistirme");

		Courses[] courses = {course1};
		CourseManager coursemanager=new CourseManager(new HibernateCoursesDao(),loggers,courses);
		coursemanager.Add(new Courses(1, "Java Programlama2", "Eren Can Şahin", 30, "Yazil2im Gelistirme"));
		
	}

}
