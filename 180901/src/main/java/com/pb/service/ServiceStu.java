package com.pb.service;

import com.pb.entity.Student;

public interface ServiceStu {
	void insertStudent(Student stu);
	int selectStudentByName(Student stu);
}
