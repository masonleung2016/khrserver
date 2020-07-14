package com.ufostudio.khr.mapper;

import org.apache.ibatis.annotations.Param;
import com.ufostudio.khr.model.Position;

import java.util.List;

/**
 * @Author: LCF
 * @Date: 2020/7/7 9:31
 * @Package: com.ufostudio.khr.mapper
 */

public interface PositionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Position record);

    int insertSelective(Position record);

    Position selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Position record);

    int updateByPrimaryKey(Position record);

    List<Position> getAllPositions();

    Integer deletePositionsByIds(@Param("ids") Integer[] ids);
    
}
