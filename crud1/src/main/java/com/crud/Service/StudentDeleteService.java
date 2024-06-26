package com.crud.Service;

import com.crud.Dao.StudentDeleteDao;

public class StudentDeleteService {

	
	private StudentDeleteDao studentDeleteDao;
	public StudentDeleteService() {
		// TODO Auto-generated constructor stub
	studentDeleteDao=new StudentDeleteDao();
	
	}
	
	public void Delete(String x) {
		studentDeleteDao.DeleteData(x);
		
	}
	
	
	
}
