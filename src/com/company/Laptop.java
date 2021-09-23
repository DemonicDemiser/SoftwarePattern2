package com.company;

public class Laptop extends Technology{

    public Laptop() {
        super(new HaveNotTouchPad(), new HaveFingerPrint());
    }

    @Override
    public void turnOn() {

    }
}
