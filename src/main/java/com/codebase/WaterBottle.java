package com.codebase;

public class WaterBottle {
    private int volume;
    public WaterBottle() {
        this.volume = 100;
    }
    public void drink() {
        this.volume -= 10;
    }
    public void empty() {
        this.volume = 0;
    }
    public void refill() {
        this.volume = 100;
    }
    public int getVolume() {
        return this.volume;
    }
}
