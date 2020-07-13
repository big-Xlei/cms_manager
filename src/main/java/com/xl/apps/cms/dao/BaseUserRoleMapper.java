package com.xl.apps.cms.dao;

import com.xl.apps.cms.bean.BaseUserRole;
import com.xl.apps.cms.bean.BaseUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseUserRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_user_role
     *
     * @mbg.generated Fri Nov 22 15:54:30 CST 2019
     */
    long countByExample(BaseUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_user_role
     *
     * @mbg.generated Fri Nov 22 15:54:30 CST 2019
     */
    int deleteByExample(BaseUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_user_role
     *
     * @mbg.generated Fri Nov 22 15:54:30 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_user_role
     *
     * @mbg.generated Fri Nov 22 15:54:30 CST 2019
     */
    int insert(BaseUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_user_role
     *
     * @mbg.generated Fri Nov 22 15:54:30 CST 2019
     */
    int insertSelective(BaseUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_user_role
     *
     * @mbg.generated Fri Nov 22 15:54:30 CST 2019
     */
    List<BaseUserRole> selectByExample(BaseUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_user_role
     *
     * @mbg.generated Fri Nov 22 15:54:30 CST 2019
     */
    BaseUserRole selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_user_role
     *
     * @mbg.generated Fri Nov 22 15:54:30 CST 2019
     */
    int updateByExampleSelective(@Param("record") BaseUserRole record, @Param("example") BaseUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_user_role
     *
     * @mbg.generated Fri Nov 22 15:54:30 CST 2019
     */
    int updateByExample(@Param("record") BaseUserRole record, @Param("example") BaseUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_user_role
     *
     * @mbg.generated Fri Nov 22 15:54:30 CST 2019
     */
    int updateByPrimaryKeySelective(BaseUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_user_role
     *
     * @mbg.generated Fri Nov 22 15:54:30 CST 2019
     */
    int updateByPrimaryKey(BaseUserRole record);
}