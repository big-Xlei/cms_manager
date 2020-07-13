package com.xl.apps.cms.web.controller;

import com.xl.apps.cms.bean.dor.Ridrepole;
import com.xl.apps.cms.service.door.RidrepoleServiceImpl;
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

import java.util.List;

@Validated
@RestController
@RequestMapping("/ridrepole")
//栋号和楼层查询功能
public class RidrepoleController {

    @Autowired
    private RidrepoleServiceImpl ridrepoleService;

    @ApiOperation(value = "查询所有栋号和楼层")
    @GetMapping(value = "findAllRidreole")
    public Message findAll() {
        List<Ridrepole> list = ridrepoleService.selectAllRidreole();
        return MessageUtil.success(list);
    }

    @ApiOperation(value = "新增栋号和楼层")
    @PostMapping(value = "insertRidrepoleAndFloor")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "ridrepole_num", value = "楼号", paramType = "query"),
            @ApiImplicitParam(name = "floor", value = "楼层号", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "状态", paramType = "query"),
            @ApiImplicitParam(name = "parent_id", value = "父id", paramType = "query")
    })
    public Message insertRidrepoleAndFloor(String ridrepole_num,
                                           String floor,
                                           String status,
                                           String parent_id) {
        Ridrepole ridrepole = new Ridrepole(ridrepole_num, floor, status, parent_id);

        ridrepoleService.addRidrepoleAndFloor(ridrepole);
        return MessageUtil.success("添加成功");
    }

    @ApiOperation(value = "通过父id查询寝室信息")
    @GetMapping(value = "findFloorByParentId")
    @ApiImplicitParams(
            @ApiImplicitParam(name = "id", value = "父id", paramType = "query")

    )
    public Message findFloorByParentId(String id) {

        List<Ridrepole> list = ridrepoleService.findFloorByParentId(id);

        return MessageUtil.success(list);
    }

    @ApiOperation(value = "更新寝室楼层信息")
    @PostMapping(value = "updateRidrepole")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "id", paramType = "query"),
            @ApiImplicitParam(name = "ridrepole_num", value = "楼号", paramType = "query"),
            @ApiImplicitParam(name = "floor", value = "楼层号", paramType = "query"),
            @ApiImplicitParam(name = "statue", value = "状态", paramType = "query"),
            @ApiImplicitParam(name = "parentId", value = "父id", paramType = "query"),
            @ApiImplicitParam(name = "descs", value = "异常状态下描述", paramType = "query")
    })
    public Message updateRidrepole(Long id,
                                   String ridrepole_num,
                                   String floor,
                                   String statue,
                                   String parentId,
                                   String descs) {

        Ridrepole ridrepole = new Ridrepole(id, ridrepole_num, floor, statue, parentId, descs);
        System.out.println(ridrepole.toString());

        ridrepoleService.updateRidrepole(ridrepole);
        return MessageUtil.success("更新成功");
    }


    @ApiOperation(value = "插入寝室楼层信息")
    @PostMapping(value = "insertRidrepole")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "ridrepole_num", value = "楼号", paramType = "query"),
            @ApiImplicitParam(name = "floor", value = "楼层号", paramType = "query"),
            @ApiImplicitParam(name = "statue", value = "状态", paramType = "query"),
            @ApiImplicitParam(name = "parentId", value = "父id", paramType = "query"),
            @ApiImplicitParam(name = "descs", value = "异常状态下描述", paramType = "query")
    })
    public Message insertRidrepole(
                                   String ridrepole_num,
                                   String floor,
                                   String statue,
                                   String parentId,
                                   String descs) {
        System.out.println("ppppppppppppppppppppppp"+parentId);




        if(floor==null){
            floor = ridrepole_num;

            Ridrepole ridrepole2 = ridrepoleService.insureTrue(ridrepole_num,floor);

            if(ridrepole2.getId() != 0){
                throw new CustomerException("该楼已存在");
            }


            Ridrepole ridrepole1 = new Ridrepole(ridrepole_num, floor, statue, parentId, descs);
            ridrepoleService.addRidrepoleAndFloor(ridrepole1);
            return MessageUtil.success("插入整栋楼层成功");
        }


        Ridrepole ridrepole2 = ridrepoleService.insureTrue(ridrepole_num,floor);


        if(ridrepole2.getId() != 0){
            throw new CustomerException("该楼层已存在");
        }



        Ridrepole ridrepole = new Ridrepole(ridrepole_num, floor, statue, parentId, descs);
        ridrepoleService.addRidrepoleAndFloor(ridrepole);
        return MessageUtil.success("插入楼层成功");


    }






    @ApiOperation(value = "删除寝室楼层")
    @GetMapping(value = "deleteRidrepole")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "寝室楼id" ,paramType = "query")
    })
    public Message deleteRidrepole(Long id){
        ridrepoleService.deleteRidrepoleByid(id);
        return MessageUtil.success("删除成功");
    }

}
