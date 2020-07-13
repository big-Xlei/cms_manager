package com.xl.apps.cms.dao.dor;

import java.util.List;

import com.xl.apps.cms.bean.dor.Student;

public interface StudentMapper {
	
	//通过寝室号查找到该寝室所有学生
	List<Student> selectStudentByDoorNum(String door_num);

	//修改学生基本信息
	void updateStudent(Student student);

	//查询可修改状态
	String selectStudentAlterable(String str);

	//删除学生
	void deleteStudent(String s_number);

	//插入学生
	void insertStudent(Student student);

	//查询学生人数

	int selectDoorNumCount(String door_num);

}
