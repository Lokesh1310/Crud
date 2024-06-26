package com.crud.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.crud.Entity.Student;

public class StudentInsertDao {

	private SessionFactory sessionFactory;
	public StudentInsertDao() {
	Configuration configuration=new Configuration().configure();
	sessionFactory=configuration.buildSessionFactory();
		
		// TODO Auto-generated constructor stub
	}
	
	
	public void SaveData(Student student) {
		
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.save(student);
		tr.commit();
		session.close();

		
	}
}
