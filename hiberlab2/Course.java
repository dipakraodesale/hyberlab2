package com.hiberlab2;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	@Id

	private int cid;
	private String coursename;
	public int getCid() {
		return cid;
	}
	public void setCid(int Cid) {
		this.cid = Cid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public void setSubjectname(String string) {


	}


}
	

