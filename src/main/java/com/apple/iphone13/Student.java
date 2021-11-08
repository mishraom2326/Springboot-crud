package com.apple.iphone13;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue
	private long personid;
	public long getPersonid() {
		return personid;
	}
	public void setPersonid(long personid2) {
		this.personid = personid2;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	@Column(name="LastName")
	private String LastName ;
	@Column(name="FirstName")
	private String FirstName ;
	@Column(name="Age")
	private int Age ;

}
