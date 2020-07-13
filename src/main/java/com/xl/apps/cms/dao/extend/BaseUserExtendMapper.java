package com.xl.apps.cms.dao.extend;


import java.util.List;

import com.xl.apps.cms.bean.extend.BaseUserExtend;

public interface BaseUserExtendMapper {
    BaseUserExtend selectById(long id);

    List<BaseUserExtend> selectAll();
}
