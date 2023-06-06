package com.jspider.Hibernate.TestProject;

import javax.persistence.Id;
import org.hibernate.annotations.Entity;
import org.hibernate.dialect.MySQL5Dialect;


//pojo class java bean class

@Entity
public class Student 
{
	@Id //because have to make as priimary key used id annotation
	private int usn;
	private String name;
	private double marks;
	public int getUsn() {
		return usn;
	}
	public void setUsn(int usn) {
		this.usn = usn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public Student() 
	{
		
			
	}
	@Override
	public String toString() {
		return "Student [usn=" + usn + ", name=" + name + ", marks=" + marks + "]";
	}

}
