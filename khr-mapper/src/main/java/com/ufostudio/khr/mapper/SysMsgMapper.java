package com.ufostudio.khr.mapper;

import com.ufostudio.khr.model.SysMsg;

/**
 * @Author: LCF
 * @Date: 2020/7/7 9:31
 * @Package: com.ufostudio.khr.mapper
 */

public interface SysMsgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysMsg record);

    int insertSelective(SysMsg record);

    SysMsg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysMsg record);

    int updateByPrimaryKey(SysMsg record);
    
}
