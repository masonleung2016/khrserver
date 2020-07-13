package com.ufostudio.khr.mapper;

import org.apache.ibatis.annotations.Param;
import com.ufostudio.khr.model.MailSendLog;

import java.util.Date;
import java.util.List;

/**
 * @Author: LCF
 * @Date: 2020/7/7 9:28
 * @Package: com.ufostudio.khr.mapper
 */

public interface MailSendLogMapper {
    Integer updateMailSendLogStatus(@Param("msgId") String msgId, @Param("status") Integer status);

    Integer insert(MailSendLog mailSendLog);

    List<MailSendLog> getMailSendLogsByStatus();

    Integer updateCount(@Param("msgId") String msgId, @Param("date") Date date);
    
}
