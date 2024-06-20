package com.web.Service;

import com.web.Dao.StudentDao;
import com.web.Entity.Student;

public class StudentService {

	
	
	private StudentDao studentDao;
	
	public StudentService() {
	studentDao=new StudentDao();	
		
	}
	
	
	public Student findbyId(int id) {
		
		
		return studentDao.findbyId(id);
	}
	
	
}
