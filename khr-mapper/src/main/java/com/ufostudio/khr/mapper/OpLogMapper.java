package com.ufostudio.khr.mapper;

import com.ufostudio.khr.model.OpLog;

/**
 * @Author: LCF
 * @Date: 2020/7/7 9:30
 * @Package: com.ufostudio.khr.mapper
 */

public interface OpLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OpLog record);

    int insertSelective(OpLog record);

    OpLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OpLog record);

    int updateByPrimaryKey(OpLog record);
}
