package com.xl.apps.cms.service.door;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xl.apps.cms.bean.dor.Teacher;
import com.xl.apps.cms.dao.dor.TeacherMapper;

@Service
public class TeacherServiceImpl {

	@Resource
	private TeacherMapper teacherMapper;

	//通过教师编号查询教师信息
	public Teacher selectTeacherByt_num(String t_num){
		
		return teacherMapper.selectTeacherByt_num(t_num);
	}

	//更新教师信息
	public void updateTeacher(Teacher teacher){
		teacherMapper.updateTeacher(teacher);
	}

	//查询教师是否可更新
	public String selectTeacherAlterable(String str){
		return teacherMapper.selectTeacherAlterable(str);
	}
}
