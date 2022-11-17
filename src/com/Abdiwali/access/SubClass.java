package com.Abdiwali.access;

public class SubClass extends A{
    public SubClass(int num ,String name){
        super(num,name);
    }

    public static void main(String[] args) {
        SubClass obj=new SubClass(45,"kunal");
        int n=obj.num;
        System.out.println(n);
        System.out.println(obj instanceof Object);
    }
}
