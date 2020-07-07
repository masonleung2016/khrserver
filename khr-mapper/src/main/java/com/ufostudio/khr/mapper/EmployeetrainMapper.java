package com.ufostudio.khr.mapper;

import com.ufostudio.khr.model.Employeetrain;

/**
 * @Author: LCF
 * @Date: 2020/7/7 9:26
 * @Package: com.ufostudio.khr.mapper
 */

public interface EmployeetrainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employeetrain record);

    int insertSelective(Employeetrain record);

    Employeetrain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employeetrain record);

    int updateByPrimaryKey(Employeetrain record);
}
