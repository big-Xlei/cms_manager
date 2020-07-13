package com.xl.apps.cms.dao.dor;

import java.util.List;

import com.xl.apps.cms.bean.dor.Ridrepole;

public interface RidrepoleMapper {
	//查询所有的栋号以及其中的楼层号
	List<Ridrepole> findAllRidrepole();
	
	//增加栋号同时增加楼层号
	void insertRidrepoleAndFloor(Ridrepole ridrepole);

	//查询所有的楼
	List<Ridrepole> findAllTower();

	//查询该楼的各个楼层
	List<Ridrepole> findFloorByParentId(String parent_id);

	//更新楼层信息
	void updateRidrepole(Ridrepole ridrepole);

	//通过id删除楼层
	void deleteRidreploeByid(Long id);

	//查看楼层是否已经存在
	Ridrepole insureTrue(String ridre,String floor);

	
}
