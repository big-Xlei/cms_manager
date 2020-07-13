package com.xl.apps.cms.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xl.apps.cms.bean.BasePrivilege;
import com.xl.apps.cms.service.IBasePrivilegeService;
import com.xl.apps.cms.utils.Message;
import com.xl.apps.cms.utils.MessageUtil;
import com.xl.apps.cms.vm.PrivilegeTree;

import io.swagger.annotations.ApiOperation;

/**
 * 
 * @author DX
 *	权限管理控制器
 */
@Validated
@RestController
@RequestMapping("/privilege")
public class PrivilegeController {

    @Autowired
    private IBasePrivilegeService basePrivilegeService;

    @ApiOperation(value = "查询所有")
    @GetMapping(value = "findAll")
    public Message findAll(){
        List<BasePrivilege> list = basePrivilegeService.findAll();
        return MessageUtil.success(list);
    }



    @ApiOperation(value = "通过parentId查询")
    @GetMapping(value = "findByParentId")
    public Message findByParentId(Long id){
        List<BasePrivilege> list = basePrivilegeService.findByParentId(id);
        return MessageUtil.success(list);
    }

    @ApiOperation(value ="保存或更新")
    @PostMapping(value = "saveOrUpdate")
    public Message saveOrUpdate(BasePrivilege privilege){
        basePrivilegeService.saveOrUpdate(privilege);
        return MessageUtil.success("更新成功");
    }

    @ApiOperation(value = "查询树")
    @GetMapping(value = "findPrivilegeTree")
    public Message findPrivilegeTree(){
        List<PrivilegeTree> list = basePrivilegeService.findPrivilegeTree();
        return MessageUtil.success(list);
    }



}
