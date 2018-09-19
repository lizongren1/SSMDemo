package com.pb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pb.entity.Student;
import com.pb.mapper.Mapper;
@Service
public class ServiceImpl implements ServiceStu{
	Mapper mapper;
	@Autowired
	public void setMapper(Mapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public void insertStudent(Student stu) {
		mapper.insertStudent(stu);
	}

	@Override
	public int selectStudentByName(Student stu) {
		// TODO Auto-generated method stub
		return mapper.selectStudentByName(stu);
	}

}
