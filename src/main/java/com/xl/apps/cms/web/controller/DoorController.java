package com.xl.apps.cms.web.controller;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xl.apps.cms.bean.dor.Door;
import com.xl.apps.cms.service.door.DoorServiceImpl;
import com.xl.apps.cms.utils.Message;
import com.xl.apps.cms.utils.MessageUtil;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Validated
@RestController
@RequestMapping("/door")
public class DoorController {

	@Autowired
	private DoorServiceImpl doorServiceImpl;
	
	@ApiOperation(value = "查询该楼层里面所包含的寝室")
	@ApiImplicitParams(
            @ApiImplicitParam(name = "froms",value = "楼层号",paramType = "query")
    )
    @GetMapping(value = "findAlldoorByfrom")
	public Message findAlldoorByfrom(Long froms) {
		System.out.print("=============="+froms+"================");
		List<Door> list = doorServiceImpl.selectByFrom(froms);
		System.out.println(list);
		return MessageUtil.success(list);
	}
	@ApiOperation(value = "删除寝室通过id")
    @ApiImplicitParams(
            @ApiImplicitParam(name = "id",value = "寝室id",paramType = "query")
    )
    @GetMapping(value= "deleteDoorByid")
    public Message deleteDoorByid(Long id){
        doorServiceImpl.deleteDoorByid(id);
        return MessageUtil.success("删除成功");
    }
	
}
