package com.xl.apps.cms.web.controller;

import com.xl.apps.cms.bean.dor.Student;
import com.xl.apps.cms.service.door.StudentServiceImpl;
import com.xl.apps.cms.utils.CustomerException;
import com.xl.apps.cms.utils.Message;
import com.xl.apps.cms.utils.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.List;

@Validated
@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentServiceImpl studentServiceImpl;
	
	
	@ApiOperation("通过寝室号码查询里面的学生")
	@GetMapping("findAllStudentBydoor")
	@ApiImplicitParams(
	            @ApiImplicitParam(name = "door_num",value = "寝室号",paramType = "query")
	    )
	public Message findAllStudentByDoorNum(@NotNull String door_num) {
		List<Student> list = studentServiceImpl.selectStudentByDoorNum(door_num);
		return MessageUtil.success(list);
				
	}

	@ApiOperation("通过学号修改学生基本信息")
	@PostMapping("updateStudentMessage")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "name", value = "名字", paramType = "query"),
			@ApiImplicitParam(name = "sex", value = "性别", paramType = "query"),
			@ApiImplicitParam(name = "s_number", value = "学号", paramType = "query"),
			@ApiImplicitParam(name = "class_name", value = "班级名称", paramType = "query"),
			@ApiImplicitParam(name = "s_tel", value = "手机号", paramType = "query"),
			@ApiImplicitParam(name = "door_num", value = "寝室号", paramType = "query"),
			@ApiImplicitParam(name = "t_name", value = "班主任名称", paramType = "query"),
			@ApiImplicitParam(name = "t_num", value = "班主任编号", paramType = "query"),
			@ApiImplicitParam(name = "state", value = "状态", paramType = "query"),
			@ApiImplicitParam(name = "descs", value = "状态描述", paramType = "query")
	})
	public Message updateStudentMessage(

			String name,
			String sex,
			String s_number,
			String class_name,
			String s_tel,
			String t_name,
			String door_num,
			String t_num,
			String state,
			String descs
	){

		String alterable = studentServiceImpl.selectStdentAlterable(s_number);
		System.out.println("================"+alterable+"=============================");
		if(alterable.equals("1")){
		Student student = new Student( name,  sex,  s_number,  class_name,  s_tel,  t_name,
				 door_num,  t_num, state, descs );
		studentServiceImpl.updateStudentMessage(student);
		return MessageUtil.success("学生信息修改成功");
		}else {
			throw new CustomerException("学生信息已被锁定不可修改");
		}

	}

	@ApiOperation("删除学生")
	@GetMapping("deleteStudent")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "s_number",value = "学生号",paramType = "query")
	})
	public Message deleteStudent(String s_number){

		String alterable = studentServiceImpl.selectStdentAlterable(s_number);
		if(alterable.equals("1")){
			studentServiceImpl.deleteStudent(s_number);

			return MessageUtil.success("删除学生完成");
		}else {
			throw new CustomerException("该学生不可被删除");
		}


	}

	@ApiOperation("新增学生")
	@PostMapping("insertStudent")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "name", value = "名字", paramType = "query"),
			@ApiImplicitParam(name = "sex", value = "性别", paramType = "query"),
			@ApiImplicitParam(name = "s_number", value = "学号", paramType = "query"),
			@ApiImplicitParam(name = "class_name", value = "班级名称", paramType = "query"),
			@ApiImplicitParam(name = "s_tel", value = "手机号", paramType = "query"),
			@ApiImplicitParam(name = "door_num", value = "寝室号", paramType = "query"),
			@ApiImplicitParam(name = "t_name", value = "班主任名称", paramType = "query"),
			@ApiImplicitParam(name = "t_num", value = "班主任编号", paramType = "query"),
			@ApiImplicitParam(name = "state", value = "状态", paramType = "query"),
			@ApiImplicitParam(name = "descs", value = "状态描述", paramType = "query")
	})
	public Message insertStudent(
			String name,
			String sex,
			String s_number,
			String class_name,
			String s_tel,
			String t_name,
			String door_num,
			String t_num,
			String state,
			String descs
	){

		//查询该寝室人数
		int num = studentServiceImpl.selectDoorNumCount(door_num);
		if(num>=6){
			throw new CustomerException("该寝室学生已满，请修改寝室号");
		}else {

			Student student = new Student(name, sex, s_number, class_name, s_tel, t_name,
					door_num, t_num, state, descs);
			studentServiceImpl.insertStudent(student);
			return MessageUtil.success("插入学生成功");
		}
	}


} 