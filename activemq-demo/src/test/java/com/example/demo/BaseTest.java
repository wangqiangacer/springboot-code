package com.example.demo;

import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jms.Destination;
import javax.jms.JMSProducer;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BaseTest {
    @Autowired
    private JMSProducer jmsProducer;

    @Test
    public void testJms() {
        Destination destination = new ActiveMQQueue("springboot.queue.test");

        for (int i=0;i<10;i++) {
            jmsProducer.send(destination,"hello,world!" + i);
        }
    }
}
