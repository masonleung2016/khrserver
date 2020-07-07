package com.ufostudio.khr.mapper;

import com.ufostudio.khr.model.Menu;

import java.util.List;

/**
 * @Author: LCF
 * @Date: 2020/7/7 9:28
 * @Package: com.ufostudio.khr.mapper
 */

public interface MenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);

    List<Menu> getMenusByHrId(Integer hrid);

    List<Menu> getAllMenusWithRole();

    List<Menu> getAllMenus();

    List<Integer> getMidsByRid(Integer rid);
}
