package com.xl.apps.cms.web.controller;

import com.xl.apps.cms.bean.dor.Teacher;
import com.xl.apps.cms.service.door.TeacherServiceImpl;
import com.xl.apps.cms.utils.CustomerException;
import com.xl.apps.cms.utils.Message;
import com.xl.apps.cms.utils.MessageUtil;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import javax.validation.constraints.NotNull;

@Validated
@RestController
@RequestMapping("/teacher")
public class TeacherController {
	
	@Autowired
	private TeacherServiceImpl teacherSertviceImpl;
	@Autowired
	private DataSource dataSource;
	
	@ApiOperation("通过教师编号查询教师信息")
	@GetMapping("findTeacherByt_num")
	@ApiImplicitParams(
            @ApiImplicitParam(name = "t_num",value = "教师编号",paramType = "query")
    )
	public Message findTeacherByt_num(@NotNull String t_num) {
		Teacher teacher = teacherSertviceImpl.selectTeacherByt_num(t_num);
		return MessageUtil.success(teacher);
	}

	@ApiOperation("通过教师编号修改教师基本信息")
	@PostMapping ("updateTeacherMessage")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "t_name", value = "名字", paramType = "query"),
			@ApiImplicitParam(name = "sex", value = "性别", paramType = "query"),
			@ApiImplicitParam(name = "t_num", value = "教师编号", paramType = "query"),
			@ApiImplicitParam(name = "class_name", value = "班级名称", paramType = "query"),
			@ApiImplicitParam(name = "tel", value = "电话", paramType = "query"),
			@ApiImplicitParam(name = "state", value = "状态", paramType = "query"),
			@ApiImplicitParam(name = "descs", value = "状态描述", paramType = "query")
	})
	public Message updateTeacherMessage(
			String t_name,
			String sex,
			String t_num,
			String class_name,
			String tel,
			String state,
			String descs
	){
		String str = teacherSertviceImpl.selectTeacherAlterable(t_num);
		if(str.equals("1")){

		Teacher teacher = new Teacher( t_name,  t_num,  sex,  class_name, tel, state, descs);
		teacherSertviceImpl.updateTeacher(teacher);

		return MessageUtil.success("修改教师信息成功");
		}else {
			throw new CustomerException("教师信息已被锁定无法更改");
		}

	}

}
