package com.ufostudio.khr.mapper;

import com.ufostudio.khr.model.MsgContent;

/**
 * @Author: LCF
 * @Date: 2020/7/7 9:29
 * @Package: com.ufostudio.khr.mapper
 */

public interface MsgContentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MsgContent record);

    int insertSelective(MsgContent record);

    MsgContent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MsgContent record);

    int updateByPrimaryKey(MsgContent record);
    
}
