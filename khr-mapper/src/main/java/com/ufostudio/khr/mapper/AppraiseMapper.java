package com.ufostudio.khr.mapper;

import com.ufostudio.khr.model.Appraise;

/**
 * @Author: LCF
 * @Date: 2020/7/7 9:23
 * @Package: com.ufostudio.khr.mapper
 */

public interface AppraiseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Appraise record);

    int insertSelective(Appraise record);

    Appraise selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Appraise record);

    int updateByPrimaryKey(Appraise record);
}
