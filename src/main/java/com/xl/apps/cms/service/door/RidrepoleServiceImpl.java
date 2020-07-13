package com.xl.apps.cms.service.door;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xl.apps.cms.bean.dor.Ridrepole;
import com.xl.apps.cms.dao.dor.RidrepoleMapper;

@Service
public class RidrepoleServiceImpl {

	@Resource
	private RidrepoleMapper ridrepoleMapper;
	
	//查询所有的栋号和楼层
	public List<Ridrepole> selectAllRidreole(){
		
		return ridrepoleMapper.findAllRidrepole();
		
	}
	//插入新的栋号和楼层
	public void addRidrepoleAndFloor(Ridrepole ridrepole) {
		
		ridrepoleMapper.insertRidrepoleAndFloor(ridrepole);
		
	}
	//通过父id查询楼层，如果没有父id就返回楼号
	public List<Ridrepole> findFloorByParentId(String parenr_id){

		if(parenr_id==null){
			//查询所有没有partner_id的楼层信息
			return ridrepoleMapper.findAllTower();
		}

		return ridrepoleMapper.findFloorByParentId(parenr_id);
	}

	//更新寝室楼信息

	public  void updateRidrepole(Ridrepole ridrepole){
		ridrepoleMapper.updateRidrepole(ridrepole);
	}

	//通过id删除楼层
	public void deleteRidrepoleByid(Long id){
		ridrepoleMapper.deleteRidreploeByid(id);
	}

	//查看寝室楼是否存在

	public Ridrepole insureTrue(String ridre,String floor){
		return ridrepoleMapper.insureTrue(ridre,floor);
	}
	
}
