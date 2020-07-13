package com.xl.apps.cms.bean.extend;


import java.util.List;

import com.xl.apps.cms.bean.BasePrivilege;
import com.xl.apps.cms.bean.BaseRole;

/**
 * @program: cms_jd1911
 * @description: 角色拓展类
 * @author: charles
 * @create: 2019-11-17 22:01
 **/

public class BaseRoleExtend extends BaseRole {
    private List<BasePrivilege> privileges;

    public List<BasePrivilege> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<BasePrivilege> privileges) {
        this.privileges = privileges;
    }
}
