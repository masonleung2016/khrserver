package com.ufostudio.khr.mapper;

import com.ufostudio.khr.model.Employeeremove;

/**
 * @Author: LCF
 * @Date: 2020/7/7 9:26
 * @Package: com.ufostudio.khr.mapper
 */

public interface EmployeeremoveMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employeeremove record);

    int insertSelective(Employeeremove record);

    Employeeremove selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employeeremove record);

    int updateByPrimaryKey(Employeeremove record);
}
