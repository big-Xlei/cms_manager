package com.xl.apps.cms.dao.extend;


import java.util.List;

import com.xl.apps.cms.bean.BaseRole;
import com.xl.apps.cms.bean.extend.BaseRoleExtend;


public interface BaseRoleExtendMapper {
    List<BaseRole> selectByUserId(long id);

    List<BaseRoleExtend> selectAll();
}
