package com.Abdiwali.properties.inheritance;

import java.util.ArrayList;

public class BoxWeight extends Box{
    double weight;
    public BoxWeight(){
        this.weight=-1;
    }

    public BoxWeight(BoxPrice other) {

    }

    static void greeting(){
        System.out.println("hi i am boxWeight");
        ArrayList list=new ArrayList();
    }
    BoxWeight(double side , double weight){
        super(side);
        this.weight=weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        // used to initialise values present in parent class
        super(l, h, w); // what is this? call the parent class constructor
//        System.out.println(super.weight);
        this.weight=weight;
    }


}
