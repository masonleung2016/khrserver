package com.ufostudio.khr.service;

import com.ufostudio.khr.mapper.PositionMapper;
import com.ufostudio.khr.model.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Author: LCF
 * @Date: 2020/7/7 9:56
 * @Package: com.ufostudio.khr.service
 */

@Service
public class PositionService {
    @Autowired
    PositionMapper positionMapper;
    public List<Position> getAllPositions() {
        return positionMapper.getAllPositions();
    }

    public Integer addPosition(Position position) {
        position.setEnabled(true);
        position.setCreateDate(new Date());
        return positionMapper.insertSelective(position);
    }

    public Integer updatePositions(Position position) {
        return positionMapper.updateByPrimaryKeySelective(position);
    }

    public Integer deletePositionById(Integer id) {
        return positionMapper.deleteByPrimaryKey(id);
    }

    public Integer deletePositionsByIds(Integer[] ids) {
        return positionMapper.deletePositionsByIds(ids);
    }
}
