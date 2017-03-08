package org.personal.sample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String arg[]){

        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        System.out.println(context.getMessage("myApp.personal.message", null, "Default sample message", null));

        Shape shape = context.getBean("triangle", Shape.class);
        shape.draw();

        shape = context.getBean("circle", Shape.class);
        shape.draw();
    }
}
