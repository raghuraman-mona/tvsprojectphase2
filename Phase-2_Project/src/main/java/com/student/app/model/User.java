package com.student.app.model;

public class User {

	private String teacher_name;
	private String subject_name;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public String getTeacher_name() {
		return teacher_name;
	}

	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}

	public String getSubject_name() {
		return subject_name;
	}

	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}

	@Override
	public String toString() {
		return "User [teacher_name=" + teacher_name + ", subject_name=" + subject_name + "]";
	}

	
}
