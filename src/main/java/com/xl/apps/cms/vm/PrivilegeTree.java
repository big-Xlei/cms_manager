package com.xl.apps.cms.vm;


import java.util.List;

import com.xl.apps.cms.bean.BasePrivilege;

/**
 * 
 * @author DX
 *	权限树
 */
public class PrivilegeTree extends BasePrivilege {
    private List<BasePrivilege> children;

    public List<BasePrivilege> getChildren() {
        return children;
    }

    public void setChildren(List<BasePrivilege> children) {
        this.children = children;
    }
}
