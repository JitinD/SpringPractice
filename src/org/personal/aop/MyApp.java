package org.personal.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String arg[]){

        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        ShapeService shapeService = context.getBean("shapeService", ShapeService.class);

        Rectangle rectangle = shapeService.getRectangle();
        //System.out.println(rectangle.getName());
    }
}
