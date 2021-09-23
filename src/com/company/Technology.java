package com.company;

public abstract class Technology {

    //composition and aggregation
    private TouchPadBehavior touchPadBehavior;
    private FingerPrintBehavior fingerPrintBehavior;

    //constructor
    public Technology(TouchPadBehavior touchPadBehavior, FingerPrintBehavior fingerPrintBehavior) {
        this.touchPadBehavior = touchPadBehavior;
        this.fingerPrintBehavior = fingerPrintBehavior;
    }

    //program in a interface, not in implementation
    public void touchPad() {this.touchPadBehavior.touchpad();}
    public void fingerPrint() {this.fingerPrintBehavior.fingerPrint();}

    public abstract void turnOn();

    //getter and setter
    public TouchPadBehavior getTouchPadBehavior() {
        return touchPadBehavior;
    }

    public void setTouchPadBehavior(TouchPadBehavior touchPadBehavior) {
        this.touchPadBehavior = touchPadBehavior;
    }

    public FingerPrintBehavior getFingerPrintBehavior() {
        return fingerPrintBehavior;
    }

    public void setFingerPrintBehavior(FingerPrintBehavior fingerPrintBehavior) {
        this.fingerPrintBehavior = fingerPrintBehavior;
    }
}
