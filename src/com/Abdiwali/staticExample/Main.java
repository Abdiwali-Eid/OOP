package com.Abdiwali.staticExample;

public class Main {
    public static void main(String[] args) {
        Human abdiwali=new Human(20, "Abdiwali",20000,false);
        Human Abdisayid=new Human(20, "Abdiwali",20000,false);
        System.out.println(abdiwali.name);
        System.out.println(Human.population);
        System.out.println(Human.population);
    }
    static void fun(){
        //        greeting(); // you cant use this because it requires an instance
        // but the function you are using it in does not depend on instances

        // you cannot access non static stuff without referencing their instances in
        // a static context

        // hence, here I am referencing it
        Main obj =new Main();
        obj.greeting();
    }
    void fun2(){
        greeting();
    }
    void greeting(){
        System.out.println("hello world");
    }

}

