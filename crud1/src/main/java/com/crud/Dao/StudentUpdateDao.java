package com.crud.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.crud.Entity.Student;

public class StudentUpdateDao {
	private SessionFactory sessionFactory;
	public StudentUpdateDao() {
	Configuration configuration=new Configuration().configure();
	sessionFactory=configuration.buildSessionFactory();
		
		// TODO Auto-generated constructor stub
	}
	
	
	public void Update(Student student1,int r) {
		
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
	Student student2= session.get(Student.class,r);
	student2.setAge(student1.getAge());
	student2.setEmail(student1.getEmail());
	student2.setGrade(student1.getGrade());
	student2.setName(student1.getName());
	
	session.save(student2);
		tr.commit();
		session.close();

		
	}
}
