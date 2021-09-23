package com.company;

public class Phone extends Technology{

    public Phone() {
        super(new HaveTouchPad(),new HaveFingerPrint());
    }

    @Override
    public void turnOn() { }


}
