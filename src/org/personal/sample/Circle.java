package org.personal.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Locale;

@Component
public class Circle implements Shape {
    Point centre;
    @Autowired
    private MessageSource messageSource;

    public Circle(Point centre){
        this.centre = centre;
    }

    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    @PostConstruct
    public void postInit(){
        System.out.println("Inside postInit of Circle");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Inside preDestroy of Circle");
    }

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public void draw(){
        System.out.println(this.messageSource.getMessage("cirle.draw.message", new Object[]{centre}, "The centre of Circle is : ", Locale.ENGLISH));
    }
}
