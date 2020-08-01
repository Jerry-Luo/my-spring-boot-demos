package com.jerry.springboot.mail;

import com.jerry.springboot.mail.sender.MailSenderTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author <a href="jianwei@outlook.com">Jerry Luo</a>
 * @since 2020/8/1 11:59
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
