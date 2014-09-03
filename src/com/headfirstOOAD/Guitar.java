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
    public Guitar (String serialNumber, double price, GuitarSpec spec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = spec;
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
