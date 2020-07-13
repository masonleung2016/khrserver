package com.ufostudio.khr.mapper;

import com.ufostudio.khr.model.Department;

import java.util.List;

/**
 * @Author: LCF
 * @Date: 2020/7/7 9:25
 * @Package: com.ufostudio.khr.mapper
 */

public interface DepartmentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);

    List<Department> getAllDepartmentsByParentId(Integer pid);

    void addDep(Department dep);

    void deleteDepById(Department dep);

    List<Department> getAllDepartmentsWithOutChildren();
    
}
