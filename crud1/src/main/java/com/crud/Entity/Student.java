package com.crud.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stud")
public class Student {

	@Id
	int Rollno;
	String Name;
	String Email;
	String Age;
	String Grade;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
	@Override
	public String toString() {
		return "Student [Name=" + Name + ", Email=" + Email + ", Age=" + Age + ", Grade=" + Grade + "]";
	}
	public Student(int rollno,String name, String email, String age, String grade) {
		super();
		Rollno=rollno;
		Name = name;
		Email = email;
		Age = age;
		Grade = grade;
	}
	
	
	
}
