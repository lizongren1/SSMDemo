package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pb.entity.Student;
import com.pb.service.ServiceStu;

@Controller
public class StuController {
	
	ServiceStu serviceStu;
	@Autowired
	public void setServiceStu(ServiceStu serviceStu) {
		this.serviceStu = serviceStu;
	}
	
	@RequestMapping(value="show.do")
	public String show () {
		return "login";
	}
	@RequestMapping(value="show2.do")
	public String show2 () {
		return "login2";
	}
	@RequestMapping(value="show1.do",method=RequestMethod.POST)
	public String show1 (Student stu) {
		int s = serviceStu.selectStudentByName(stu);
		if(s==1) {
			return "success1";
		}
		return "error";
	}
	@RequestMapping(value="insert.do",method=RequestMethod.POST)
	public String addStu(Student stu) {
		int a = serviceStu.selectStudentByName(stu);
		System.out.println(a+"---"+stu.getName());
		if(a==0) {
			serviceStu.insertStudent(stu);
			return "success";
		}
		
		return "error1";
	}
	@RequestMapping(value="add.do")
	public String add () {
		
		return "add";
	}
}
