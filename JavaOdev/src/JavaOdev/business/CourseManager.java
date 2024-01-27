package JavaOdev.business;

import java.util.ArrayList;
import java.util.List;

import JavaOdev.core.logging.Logger;
import JavaOdev.dataAccess.CourseDao;
import JavaOdev.entites.Courses;

public class CourseManager {
	private CourseDao coursedao;
	private Logger[] loggers;
	private Courses[] courses;
	
	public CourseManager(CourseDao coursedao, Logger[] loggers, Courses[] courses) {
		this.coursedao = coursedao;
		this.loggers = loggers;
		this.courses = courses;
	}

	public void Add(Courses course) throws Exception 
	{
		if (course.getPrice()<10) {
			throw new Exception("bir kursun fiyatı 10'dan küçük olamaz.");
		}
		for (Courses crs: courses) {
			if (course.getCourseName().equals(crs.getCourseName())) {
				throw new Exception("ayni isimde iki kurs olamaz.");
			}
			if (course.getCategoryName().equals(crs.getCategoryName())) {
				throw new Exception("ayni kategoride iki kurs olamaz.");
			}
		}
		System.out.println("Kursunuz başarıyla kaydedildi.");
		for (Logger logger: loggers) {
			logger.Log("loglandi.");
		}
	}
	
	
	
	
	
}