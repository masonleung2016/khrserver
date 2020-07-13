package com.ufostudio.khr.mapper;

import org.apache.ibatis.annotations.Param;
import com.ufostudio.khr.model.MenuRole;

/**
 * @Author: LCF
 * @Date: 2020/7/7 9:29
 * @Package: com.ufostudio.khr.mapper
 */

public interface MenuRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MenuRole record);

    int insertSelective(MenuRole record);

    MenuRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MenuRole record);

    int updateByPrimaryKey(MenuRole record);

    void deleteByRid(Integer rid);

    Integer insertRecord(@Param("rid") Integer rid, @Param("mids") Integer[] mids);
    
}
