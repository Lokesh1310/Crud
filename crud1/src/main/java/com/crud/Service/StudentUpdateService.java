package com.crud.Service;

import com.crud.Dao.StudentDeleteDao;
import com.crud.Dao.StudentUpdateDao;
import com.crud.Entity.Student;

public class StudentUpdateService {

	private StudentUpdateDao studentUpdateDao ;
	
	public StudentUpdateService() {
		// TODO Auto-generated constructor stub
studentUpdateDao=new  StudentUpdateDao();	
	}
	
	public void Update(Student student1,int r) {
		
		studentUpdateDao.Update(student1,r);
		
	} 
	
}
