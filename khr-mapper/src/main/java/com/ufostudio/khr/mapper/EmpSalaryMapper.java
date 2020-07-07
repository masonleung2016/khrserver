package com.ufostudio.khr.mapper;

import com.ufostudio.khr.model.EmpSalary;

/**
 * @Author: LCF
 * @Date: 2020/7/7 9:26
 * @Package: com.ufostudio.khr.mapper
 */

public interface EmpSalaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EmpSalary record);

    int insertSelective(EmpSalary record);

    EmpSalary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmpSalary record);

    int updateByPrimaryKey(EmpSalary record);
}
