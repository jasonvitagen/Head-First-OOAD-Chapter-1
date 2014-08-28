package com.headfirstOOAD;

import com.headfirstOOAD.enums.*;

/**
 * Created by qishen.cheng on 27/8/2014.
 */
public class Guitar {
    private String serialNumber;
    private double price;
    private GuitarSpec spec;

    /**
     * Guitar constructor method
     * @param serialNumber
     * @param price
     */
    public Guitar (String serialNumber, double price, Builder builder, String model, GuitarType type, Wood backWood, Wood topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = new GuitarSpec(builder, model, type, backWood, topWood);
    }

    public String getSerialNumber () {
        return serialNumber;
    }
    public double getPrice () {
        return price;
    }
    public GuitarSpec getSpec() {
        return spec;
    }

}
