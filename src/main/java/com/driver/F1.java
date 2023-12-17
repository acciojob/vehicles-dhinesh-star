//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.driver;

public class F1 extends Car {
    public F1(String name, boolean isManual) {
        super(name, 4, 2, 6, isManual, "F1", 1);
    }

    public void accelerate(int rate) {
        int newSpeed = super.getCurrentSpeed() + rate;
        if (newSpeed == 0) {
            super.stop();
            super.changeGear(1);
        } else if (this.getCurrentSpeed() >= 1 && this.getCurrentSpeed() <= 50) {
            super.changeGear(1);
        } else if (this.getCurrentSpeed() >= 51 && this.getCurrentSpeed() <= 100) {
            super.changeGear(2);
        } else if (this.getCurrentSpeed() >= 101 && this.getCurrentSpeed() <= 150) {
            super.changeGear(3);
        } else if (this.getCurrentSpeed() >= 151 && this.getCurrentSpeed() <= 200) {
            super.changeGear(4);
        } else if (this.getCurrentSpeed() >= 201 && this.getCurrentSpeed() <= 250) {
            super.changeGear(5);
        } else if (this.getCurrentSpeed() >= 251) {
            super.changeGear(6);
        }

        if (newSpeed > 0) {
            this.changeSpeed(newSpeed, this.getCurrentDirection());
        }

    }
}
