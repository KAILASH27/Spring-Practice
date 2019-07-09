package com.opentext.StudentWeb.Studentdto;

import javax.persistence.*;

@Entity
@Table(name = "studentinfo")
public class StudentInfo {

	@Id
	@Column(name = "RollNo")
	private int rollno;

	@Column(name = "Name")
	private String name;

	@Column(name = "Marks")
	private float marks;

	@Column(name = "MobileNo")
	private long mobileno;

	// Getters and Setters
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public long getMobileno() {
		return mobileno;
	}

	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
}// End of Class
