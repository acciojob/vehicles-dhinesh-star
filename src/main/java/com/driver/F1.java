package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned
        super(name,4,2,6,isManual,"F1",1);
    }

    public void accelerate(int rate){
        int newSpeed = 0; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */
        newSpeed=super.getCurrentSpeed()+rate;
        if(newSpeed == 0) {
            //Stop the car, set gear as 1
            super.stop();
            super.changeGear(1);
        }
        //for all other cases, change the gear accordingly
        else if(this.getCurrentSpeed()>=1 && this.getCurrentSpeed()<=50){
            super.changeGear(1);
        }
        else if(this.getCurrentSpeed()>=51 && this.getCurrentSpeed()<=100){
            super.changeGear(2);
        }
        else if(this.getCurrentSpeed()>=101 && this.getCurrentSpeed()<=150){
            super.changeGear(3);
        }
        else if(this.getCurrentSpeed()>=151 && this.getCurrentSpeed()<=200){
            super.changeGear(4);
        }
        else if(this.getCurrentSpeed()>=201 && this.getCurrentSpeed()<=250){
            super.changeGear(5);
        }
        else if(this.getCurrentSpeed()>=251){
            super.changeGear(6);
        }
        if(newSpeed > 0) {

            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
