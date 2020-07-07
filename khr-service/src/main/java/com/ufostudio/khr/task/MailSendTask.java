package com.ufostudio.khr.task;

import com.ufostudio.khr.model.Employee;
import com.ufostudio.khr.model.MailConstants;
import com.ufostudio.khr.model.MailSendLog;
import com.ufostudio.khr.service.EmployeeService;
import com.ufostudio.khr.service.MailSendLogService;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * @Author: LCF
 * @Date: 2020/7/7 9:58
 * @Package: com.ufostudio.khr.task
 */

@Component
public class MailSendTask {
    @Autowired
    MailSendLogService mailSendLogService;
    @Autowired
    RabbitTemplate rabbitTemplate;
    @Autowired
    EmployeeService employeeService;
    @Scheduled(cron = "0/10 * * * * ?")
    public void mailResendTask() {
        List<MailSendLog> logs = mailSendLogService.getMailSendLogsByStatus();
        if (logs == null || logs.size() == 0) {
            return;
        }
        logs.forEach(mailSendLog->{
            if (mailSendLog.getCount() >= 3) {
                mailSendLogService.updateMailSendLogStatus(mailSendLog.getMsgId(), 2);//直接设置该条消息发送失败
            }else{
                mailSendLogService.updateCount(mailSendLog.getMsgId(), new Date());
                Employee emp = employeeService.getEmployeeById(mailSendLog.getEmpId());
                rabbitTemplate.convertAndSend(MailConstants.MAIL_EXCHANGE_NAME, MailConstants.MAIL_ROUTING_KEY_NAME, emp, new CorrelationData(mailSendLog.getMsgId()));
            }
        });
    }
}
