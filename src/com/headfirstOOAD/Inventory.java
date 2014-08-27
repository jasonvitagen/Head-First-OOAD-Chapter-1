package com.headfirstOOAD;

import com.headfirstOOAD.enums.*;

import java.util.*;
/**
 * Created by qishen.cheng on 27/8/2014.
 */
public class Inventory {
    List guitars;

    public Inventory () {
        guitars = new LinkedList ();
    }

    public void addGuitar (Guitar guitar) {
        guitars.add(guitar);
    }

    public Guitar getGuitar (String serialNumber) {
        for (Iterator i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar) i.next();
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public List search (Guitar searchGuitar) {
        List matchingGuitars = new LinkedList();
        for (Iterator i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar) i.next();
            Builder builder = searchGuitar.getBuilder();
            if ((builder != null) && (!builder.equals("")) && (!builder.equals(guitar.getBuilder()))) {
                continue;
            }
            String model = searchGuitar.getModel();
            if ((model != null) && (!model.equals("")) && (!model.equals(guitar.getModel()))) {
                continue;
            }
            GuitarType type = searchGuitar.getType();
            if ((type != null) && (!type.equals("")) && (!type.equals(guitar.getType()))) {
                continue;
            }
            Wood backWood = searchGuitar.getBackWood();
            if ((backWood != null) && (!backWood.equals("")) && (!backWood.equals(guitar.getBackWood()))) {
                continue;
            }
            Wood topWood = searchGuitar.getTopWood();
            if ((topWood != null) && (!topWood.equals("")) && (!topWood.equals(guitar.getTopWood()))) {
                continue;
            }
            matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }

}
