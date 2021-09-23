package com.company;

public class Main {

    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        laptop.touchPad();
        laptop.fingerPrint();
        laptop.turnOn();

        TV tv = new TV();

        tv.setTouchPadBehavior(new FlexibleDisplay());
        tv.touchPad();
    }
}
