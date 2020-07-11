package com.ufostudio.khr.mapper;

import com.ufostudio.khr.model.AdjustSalary;

/**
 * @Author: LCF
 * @Date: 2020/7/7 9:24
 * @Package: com.ufostudio.khr.mapper
 */

public interface AdjustSalaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AdjustSalary record);

    int insertSelective(AdjustSalary record);

    AdjustSalary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdjustSalary record);

    int updateByPrimaryKey(AdjustSalary record);
    
}
