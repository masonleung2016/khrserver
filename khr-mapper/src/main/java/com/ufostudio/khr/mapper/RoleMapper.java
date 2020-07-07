package com.ufostudio.khr.mapper;

import com.ufostudio.khr.model.Role;

import java.util.List;

/**
 * @Author: LCF
 * @Date: 2020/7/7 9:31
 * @Package: com.ufostudio.khr.mapper
 */

public interface RoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    List<Role> getAllRoles();
}
