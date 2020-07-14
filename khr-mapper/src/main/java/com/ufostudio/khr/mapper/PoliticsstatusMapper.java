package com.ufostudio.khr.mapper;

import com.ufostudio.khr.model.Politicsstatus;

import java.util.List;

/**
 * @Author: LCF
 * @Date: 2020/7/7 9:30
 * @Package: com.ufostudio.khr.mapper
 */

public interface PoliticsstatusMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Politicsstatus record);

    int insertSelective(Politicsstatus record);

    Politicsstatus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Politicsstatus record);

    int updateByPrimaryKey(Politicsstatus record);

    List<Politicsstatus> getAllPoliticsstatus();
    
}
