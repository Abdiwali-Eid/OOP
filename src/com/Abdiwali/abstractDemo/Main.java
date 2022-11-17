package com.Abdiwali.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son=new Son(30);
        son.career();
        son.partner();

        Parent daughter=new Daughter(11);
        daughter.career();
        daughter.partner();
        son.normal();
        Parent.hello();
//    Parent daughter=new Daughter();
    }


}
