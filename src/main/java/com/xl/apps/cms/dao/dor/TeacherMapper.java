package com.xl.apps.cms.dao.dor;

import com.xl.apps.cms.bean.dor.Teacher;

public interface TeacherMapper {
	//通过教师id查询教师信息
	Teacher selectTeacherByt_num(String t_num);

	//更新教师信息
	 void updateTeacher(Teacher teacher);

	 //查询教师是否可更新
	String selectTeacherAlterable(String str);
}
