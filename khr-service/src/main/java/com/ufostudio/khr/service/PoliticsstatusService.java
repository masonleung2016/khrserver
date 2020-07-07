package com.ufostudio.khr.service;

import com.ufostudio.khr.mapper.PoliticsstatusMapper;
import com.ufostudio.khr.model.Politicsstatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: LCF
 * @Date: 2020/7/7 9:56
 * @Package: com.ufostudio.khr.service
 */

@Service
public class PoliticsstatusService {
    @Autowired
    PoliticsstatusMapper politicsstatusMapper;
    public List<Politicsstatus> getAllPoliticsstatus() {
        return politicsstatusMapper.getAllPoliticsstatus();
    }
}
