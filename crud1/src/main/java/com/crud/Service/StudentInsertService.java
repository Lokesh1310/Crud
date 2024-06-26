package com.crud.Service;

import com.crud.Dao.StudentInsertDao;
import com.crud.Entity.Student;

public class StudentInsertService {

	
	private StudentInsertDao studentInsertDao; 
	public StudentInsertService() {
		studentInsertDao=new StudentInsertDao();
		// TODO Auto-generated constructor stub
	}
	
	
	public  void save(Student student) {
		
		studentInsertDao.SaveData(student);
	}
	
}
