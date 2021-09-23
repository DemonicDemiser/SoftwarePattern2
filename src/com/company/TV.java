package com.company;

public class TV extends Technology{

    public TV() {
        super(new HaveTouchPad(), new HaveNotFingerPrint());
    }

    @Override
    public void turnOn() {

    }
}
