package com.ufostudio.khr.mapper;

import com.ufostudio.khr.model.Employeeec;

/**
 * @Author: LCF
 * @Date: 2020/7/7 9:25
 * @Package: com.ufostudio.khr.mapper
 */

public interface EmployeeecMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employeeec record);

    int insertSelective(Employeeec record);

    Employeeec selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employeeec record);

    int updateByPrimaryKey(Employeeec record);
}
