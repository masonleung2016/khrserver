package com.ufostudio.khr.mapper;

import org.apache.ibatis.annotations.Param;
import com.ufostudio.khr.model.JobLevel;

import java.util.List;

/**
 * @Author: LCF
 * @Date: 2020/7/7 9:27
 * @Package: com.ufostudio.khr.mapper
 */

public interface JobLevelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JobLevel record);

    int insertSelective(JobLevel record);

    JobLevel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JobLevel record);

    int updateByPrimaryKey(JobLevel record);

    List<JobLevel> getAllJobLevels();

    Integer deleteJobLevelsByIds(@Param("ids") Integer[] ids);
}
