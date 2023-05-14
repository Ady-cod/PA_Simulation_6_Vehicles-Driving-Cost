package com.codecool.vehicle.oilcar;

import java.util.Random;

public enum SizeType {
    SUB_COMPACT(2405,2830),
    COMPACT(2830,3110),
    MID_SIZE(3115,3395),
    LARGE(3400);
    private static final int DEFAULT_MAX_VOLUME = 5000;

    private final int minVolume;
    private final int maxVolume;


    SizeType(int minVolume, int maxVolume) {
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
    }
    SizeType(int minVolume){
        this(minVolume,DEFAULT_MAX_VOLUME);
    }
    public int generateRandomSize(){
        Random rand = new Random();
        return rand.nextInt((maxVolume-minVolume) +1) + minVolume;
    }
}
