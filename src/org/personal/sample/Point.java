package org.personal.sample;

public class Point {

    Integer X;
    Integer Y;

    public Integer getX() {
        return X;
    }

    public void setX(Integer x) {
        X = x;
    }

    public Integer getY() {
        return Y;
    }

    public void setY(Integer y) {
        Y = y;
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() +")";
    }
}
