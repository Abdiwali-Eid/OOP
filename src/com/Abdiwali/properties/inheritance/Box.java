package com.Abdiwali.properties.inheritance;

public class Box {
    private double l;
    double h;
    double w;

    static  void greeting(){
        System.out.println("hey i am in box class.");

    }
    public double getL(){
        return l;
    }
    Box(){
       this.h=-1;
       this.l=-1;
       this.w=-1;
    }
    //cube
    Box (double side){
        //super(); object class
        this.w=side;
        this.l=side;
        this.h=side;
    }

    public Box(double l, double h, double w) {
        System.out.println("Box class constructor");
        this.l = l;
        this.h = h;
        this.w = w;
    }
    Box(Box old){
        this.h=old.h;
        this.l=old.l;
        this.w=old.w;
    }


}
