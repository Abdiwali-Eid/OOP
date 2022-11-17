package com.Abdiwali.abstractDemo;

public class Son extends Parent{
    public Son(int age){
        super(age);
    }

    @Override
    void career() {
        System.out.println("i am goining to be a doctor");
    }

    @Override
    void normal() {
        super.normal();
    }


    @Override
    void partner() {
        System.out.println("I love pepper Potts");
    }
}
