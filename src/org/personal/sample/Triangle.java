package org.personal.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

import java.util.Locale;

class Triangle implements Shape{

    Point A;
    Point B;
    Point C;
    @Autowired
    private MessageSource messageSource;

    public Triangle(Point A, Point B, Point C){
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public Point getA() {
        return A;
    }

    public void setA(Point a) {
        A = a;
    }

    public Point getB() {
        return B;
    }

    public void setB(Point b) {
        B = b;
    }

    public Point getC() {
        return C;
    }

    public void setC(Point c) {
        C = c;
    }

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public void draw(){
        System.out.println(this.messageSource.getMessage("triangle.draw.message", null, "The three points of Triangle are : ", Locale.ENGLISH));
        System.out.println("A : " + A);
        System.out.println("B : " + B);
        System.out.println("C : " + C);
    }
}
