package com.ufostudio.khr.service;

import com.ufostudio.khr.mapper.NationMapper;
import com.ufostudio.khr.model.Nation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: LCF
 * @Date: 2020/7/7 9:56
 * @Package: com.ufostudio.khr.service
 */

@Service
public class NationService {
    @Autowired
    NationMapper nationMapper;
    public List<Nation> getAllNations() {
        return nationMapper.getAllNations();
    }
}
