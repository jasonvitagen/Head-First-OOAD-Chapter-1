package com.headfirstOOAD.enums;


public enum GuitarType {
    ACOUSTIC, ELECTRIC;

    public String toString () {
        switch (this) {
            case ACOUSTIC: return "Acoustic";
            case ELECTRIC: return "Electric";
        }
        return null;
    }
}