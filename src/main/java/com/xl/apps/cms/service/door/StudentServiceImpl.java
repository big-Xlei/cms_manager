package com.xl.apps.cms.service.door;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xl.apps.cms.bean.dor.Student;
import com.xl.apps.cms.dao.dor.StudentMapper;

@Service
public class StudentServiceImpl {

	@Resource
	private StudentMapper studentMappr;

	//通过寝室号查询所有学生信息
	public List<Student> selectStudentByDoorNum(String door_num){
		return studentMappr.selectStudentByDoorNum(door_num);
	}

	//通过学号修改学生信息
	public void updateStudentMessage(Student student){
		studentMappr .updateStudent(student);
	}

	//查询学生可修改状态
	public String selectStdentAlterable(String str){
		return studentMappr.selectStudentAlterable(str);
	}

	public void deleteStudent(String s_num){
		studentMappr.deleteStudent(s_num);
	}

	//插入学生
	public void insertStudent(Student student){
		studentMappr.insertStudent(student);
	}

	//查询寝室人数
	public int selectDoorNumCount(String door_num){
		return studentMappr.selectDoorNumCount(door_num);
	}
}
