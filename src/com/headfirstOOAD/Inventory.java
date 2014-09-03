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

    public List search (GuitarSpec searchGuitar) {
        List matchingGuitars = new LinkedList();
        for (Iterator i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar) i.next();
            if (guitar.getSpec().matches(searchGuitar)) {
                matchingGuitars.add(guitar);
            }
        }
        return matchingGuitars;
    }

}
