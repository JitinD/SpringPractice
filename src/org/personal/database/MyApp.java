package org.personal.database;


public class MyApp {

    public static void main(String[] args) {

        DerbyDAO dao = new DerbyDAO();

        System.out.println(dao.getRhombusCount());
        System.out.println(dao.getRhombus(1).getName());
        System.out.println(dao.getAllRhombus().size());
    }
}
