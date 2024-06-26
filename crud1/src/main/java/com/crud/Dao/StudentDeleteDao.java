package com.crud.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.crud.Entity.Student;

public class StudentDeleteDao {

	private SessionFactory sessionFactory;
	public StudentDeleteDao() {
	Configuration configuration=new Configuration().configure();
	sessionFactory=configuration.buildSessionFactory();
		
		// TODO Auto-generated constructor stub
	}
	
	
	public void DeleteData(String x) {
		
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
	Student student=session.get(Student.class,x);
	session.delete(student);	
	tr.commit();
		
	
}
}