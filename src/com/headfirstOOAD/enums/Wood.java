package com.headfirstOOAD.enums;


public enum Wood {
    ALDER, REDWOOD, ASH, BASSWOOD, KOA, MAHOGANY, MAKORE, MAPLE, INDIAN_ROSEWOOD, WALNUT;

    public String toString () {
        switch (this) {
            case ALDER: return "Alder";
            case REDWOOD: return "Redwood";
            case ASH: return "Ash";
            case BASSWOOD: return "Basswood";
            case KOA: return "Koa";
            case MAHOGANY: return "Mahogany";
            case MAKORE: return "Makore";
            case MAPLE: return "Maple";
            case INDIAN_ROSEWOOD: return "Indian Rosewood";
            case WALNUT: return "Walnut";
        }
        return null;
    }
}