package com.Abdiwali.staticExample;

import java.awt.*;

public class Human {
      int age;
      String name;
      int salary;
      boolean married;
      static  long population;

      static  void message(){
          System.out.println("hello wordl");
      }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        this.population+=1;

    }
}
