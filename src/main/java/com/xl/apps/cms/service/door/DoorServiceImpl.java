package com.xl.apps.cms.service.door;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xl.apps.cms.bean.dor.Door;
import com.xl.apps.cms.dao.dor.DoorMapper;

@Service
public class DoorServiceImpl {

	@Resource
	private DoorMapper doorMapper;
	
	public List<Door> selectByFrom(Long froms){
		return doorMapper.selectByFrom(froms);
	}

	public void deleteDoorByid(Long id){ doorMapper.deleteDoorByid(id);}
	
	
}
