package com.headfirstOOAD;

import com.headfirstOOAD.enums.*;

/**
 * Created by qishen.cheng on 28/8/2014.
 */
public class GuitarSpec {
    private Builder builder;
    private String model;
    private GuitarType type;
    private Wood backWood;
    private Wood topWood;

    public GuitarSpec (Builder builder, String model, GuitarType type, Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public Builder getBuilder () {
        return builder;
    }
    public String getModel () {
        return model;
    }
    public GuitarType getType () {
        return type;
    }
    public Wood getBackWood () {
        return backWood;
    }
    public Wood getTopWood () {
        return topWood;
    }

    public boolean matches (GuitarSpec spec) {
        if (builder != spec.builder) {
            return false;
        }
        if ((model != null) && (!model.equals("")) && (!model.equals(spec.model))) {
            return false;
        }
        if (type != spec.type) {
            return false;
        }
        if (backWood != spec.backWood) {
            return false;
        }
        if (topWood != spec.topWood) {
            return false;
        }
        return true;
    }
}
