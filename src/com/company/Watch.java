package com.company;

public class Watch extends Technology{

    public Watch() {
        super(new HaveTouchPad(), new HaveNotFingerPrint());
    }

    @Override
    public void turnOn() {

    }
}
