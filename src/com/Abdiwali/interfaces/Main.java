package com.Abdiwali.interfaces;

public class Main {
    public static void main(String[] args) {
//        Engine car=new Car();
//        car.acc();
//        car.start();
        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
    }


}
