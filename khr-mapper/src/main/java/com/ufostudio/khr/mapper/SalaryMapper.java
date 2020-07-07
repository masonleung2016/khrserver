package com.ufostudio.khr.mapper;

import com.ufostudio.khr.model.Salary;

import java.util.List;

/**
 * @Author: LCF
 * @Date: 2020/7/7 9:31
 * @Package: com.ufostudio.khr.mapper
 */

public interface SalaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Salary record);

    int insertSelective(Salary record);

    Salary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Salary record);

    int updateByPrimaryKey(Salary record);

    List<Salary> getAllSalaries();
}
