package com.headfirstOOAD.enums;


public enum Builder {

    FENDER;

    public String toString () {
        switch (this) {
            case FENDER: return "Fender";
        }
        return null;
    }
}