package com.Abdiwali.enumExamples;

public class Basic  {
    enum Week  implements  A{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // these are enum constants
        // public, static and final
        // since its final you cannot create child enums
        // type is Week

        void  display(){

        }
        Week(){
            System.out.println("constructor called for"+ this);
        }
        @Override
        public void hello() {
            System.out.println("hey how are you");
        }
    }

    public static void main(String[] args) {
        Week week;
        week=Week.Monday;
        week.hello();

////        System.out.println(week);
//        System.out.println(Week.valueOf("Monday"));

        for(Week day : Week.values()) {
           System.out.println(day);
        }
        System.out.println(week.ordinal());

    }

}
