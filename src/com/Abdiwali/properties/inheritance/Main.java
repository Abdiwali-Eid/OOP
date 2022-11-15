package com.Abdiwali.properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1=new Box(1,2,4);
//        box1.getL();
        Box box2=new Box(box1);
        System.out.println(box1.w+ " "+box1.h);
        BoxWeight box3=new BoxWeight();
        BoxWeight box4 =new BoxWeight(2,3,3,1);
        System.out.println(box3.h+" "+ box3.weight);

        Box box5=new BoxWeight(2,3,1,5);
        System.out.println(box5.w);

        // there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will you call the constructor of child class
        // this is why error
//        BoxWeight box6=new  Box(2,3,4);
//        System.out.println(box6);
        //sax:Box box6=new  BoxWEIGHT(2,3,4);
        ////        System.out.println(box6)
      Box.greeting();

        BoxWeight box = new BoxWeight();
        BoxWeight.greeting(); // you can inherit but you cannot override

    }
}
