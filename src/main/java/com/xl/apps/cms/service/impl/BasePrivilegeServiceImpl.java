package com.xl.apps.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xl.apps.cms.bean.BasePrivilege;
import com.xl.apps.cms.bean.BasePrivilegeExample;
import com.xl.apps.cms.dao.BasePrivilegeMapper;
import com.xl.apps.cms.dao.extend.BasePrivilegeExtendMapper;
import com.xl.apps.cms.service.IBasePrivilegeService;
import com.xl.apps.cms.utils.CustomerException;
import com.xl.apps.cms.vm.PrivilegeTree;


/**
 * 
 * @author DX
 *	权限控制实现类
 */
@Service
public class BasePrivilegeServiceImpl implements IBasePrivilegeService {
    @Resource
    private BasePrivilegeMapper basePrivilegeMapper;
    @Resource
    private BasePrivilegeExtendMapper basePrivilegeExtendMapper;
    
    @Override
    public List<BasePrivilege> findByUserId(long id) {
        return basePrivilegeExtendMapper.selectByUserId(id);
    }

    @Override
    public List<BasePrivilege> findAll() {
        return basePrivilegeMapper.selectByExample(new BasePrivilegeExample());
    }

    @Override
    public void saveOrUpdate(BasePrivilege privilege) throws CustomerException {
        if(privilege.getId()!=null){
            basePrivilegeMapper.updateByPrimaryKey(privilege);
        } else {
            basePrivilegeMapper.insert(privilege);
        }
    }

    @Override
    public List<BasePrivilege> findByParentId(Long parentId) {
        BasePrivilegeExample example = new BasePrivilegeExample();
        if(parentId == null){
            example.createCriteria().andParentIdIsNull();
        } else {
            example.createCriteria().andParentIdEqualTo(parentId);
        }
        return basePrivilegeMapper.selectByExample(example);
    }

    @Override
    public List<PrivilegeTree> findPrivilegeTree() {
        return basePrivilegeExtendMapper.selectAll();
    }
}
