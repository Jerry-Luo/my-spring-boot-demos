package com.jerry.springboot.mail.sender;

import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.mail.internet.MimeMessage;

/**
 * @author <a href="jianwei@outlook.com">Jerry Luo</a>
 * @since 2020/8/1 12:01
 */
@Component
public class MailSenderTest {

    @Resource
    private JavaMailSender mailSender;

    public void send(){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("test");
        message.setText("We will not use hello world");
        message.setTo("jianwei@outlook.com", "jianwei.luo@foxmail.com");
        message.setFrom("358004620@qq.com");
        mailSender.send(message);
    }

    @PostConstruct
    public void startSend(){
        send();
    }
}
