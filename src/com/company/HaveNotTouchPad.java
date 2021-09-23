package com.company;

public class HaveNotTouchPad implements TouchPadBehavior{
    @Override
    public void touchpad() {
        System.out.println("I have not touchpad!");
    }
}
