package com.pb.mapper;

import com.pb.entity.Student;

public interface Mapper {

	void insertStudent(Student stu);
	int selectStudentByName(Student stu);
	
}
