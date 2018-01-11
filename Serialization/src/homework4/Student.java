package homework4;

import java.io.Serializable;

public class Student implements Serializable{

	public Student() {
		// TODO Auto-generated constructor stub
	}
	private static final long serialVersionUID = 12345L;
	private String name = null;
	private String studentID = null;
	private String sex = null;
	public void setname(String name) {
		this.name = name;
	}
	public void setstudentID(String studentID) {
		this.studentID = studentID;
	}
	public void setsex(String sex) {
		this.sex = sex;
	}
	public String getname() {
		return this.name;
	}
	public String getstudentID() {
		return this.studentID;
	}
	public String getsex() {
		return this.sex;
	}
	
}
