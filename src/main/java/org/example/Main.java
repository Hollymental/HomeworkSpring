
package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MyService myService = context.getBean(MyService.class);
        myService.performService();

        AnotherService anotherService = (AnotherService) context.getBean("anotherService");
        anotherService.execute();
    }
}