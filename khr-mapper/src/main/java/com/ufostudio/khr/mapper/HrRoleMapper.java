package com.ufostudio.khr.mapper;

import org.apache.ibatis.annotations.Param;
import com.ufostudio.khr.model.HrRole;

/**
 * @Author: LCF
 * @Date: 2020/7/7 9:27
 * @Package: com.ufostudio.khr.mapper
 */

public interface HrRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HrRole record);

    int insertSelective(HrRole record);

    HrRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HrRole record);

    int updateByPrimaryKey(HrRole record);

    void deleteByHrid(Integer hrid);

    Integer addRole(@Param("hrid") Integer hrid, @Param("rids") Integer[] rids);
}
