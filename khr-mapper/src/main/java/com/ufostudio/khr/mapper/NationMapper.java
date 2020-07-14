package com.ufostudio.khr.mapper;

import com.ufostudio.khr.model.Nation;

import java.util.List;

/**
 * @Author: LCF
 * @Date: 2020/7/7 9:29
 * @Package: com.ufostudio.khr.mapper
 */

public interface NationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Nation record);

    int insertSelective(Nation record);

    Nation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Nation record);

    int updateByPrimaryKey(Nation record);

    List<Nation> getAllNations();
    
}
