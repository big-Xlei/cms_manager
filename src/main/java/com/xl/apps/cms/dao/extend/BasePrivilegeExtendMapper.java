package com.xl.apps.cms.dao.extend;


import java.util.List;

import com.xl.apps.cms.bean.BasePrivilege;
import com.xl.apps.cms.vm.PrivilegeTree;

public interface BasePrivilegeExtendMapper {
    List<PrivilegeTree> selectAll();

    List<BasePrivilege> selectByParentId(long id);

    List<BasePrivilege> selectByRoleId(long id);

    List<BasePrivilege> selectByUserId(long id);
}
