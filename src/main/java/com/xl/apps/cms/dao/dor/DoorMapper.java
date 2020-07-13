package com.xl.apps.cms.dao.dor;

import java.util.List;

import com.xl.apps.cms.bean.dor.Door;

public interface DoorMapper {
	
	List<Door> selectByFrom(Long from);
	void deleteDoorByid(Long id);
}
