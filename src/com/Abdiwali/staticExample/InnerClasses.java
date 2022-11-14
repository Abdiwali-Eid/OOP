package com.Abdiwali.staticExample;

public class InnerClasses {
    static class Test{
        String name;
        public Test(String name){
            this.name=name;
        }
        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        Test a=new Test("Abdiwali");
        Test b=new Test("ciid");
        System.out.println(b);
    }
}
