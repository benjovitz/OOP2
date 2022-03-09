package com.company;

import java.util.Random;

public class Dice {
    Random random=new Random();
        int faceValue= random.nextInt(1,7);

    public int getFaceValue() {
        return faceValue;
    }
    public void roll(){
    this.faceValue= random.nextInt(1,7);
    }
}
