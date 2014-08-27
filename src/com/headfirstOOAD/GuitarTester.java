package com.headfirstOOAD;


import com.headfirstOOAD.enums.*;

import java.util.*;

public class GuitarTester {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Guitar guitar = inventory.getGuitar("G1");
        System.out.println(guitar.getSerialNumber() + " - " + guitar.getBuilder() + " - " + guitar.getModel() + " - " + guitar.getType() + " - " + guitar.getTopWood() + " - " + guitar.getBackWood());

        Guitar searchGuitar = new Guitar("G5", 10.00, Builder.FENDER, "Malib CE", GuitarType.ACOUSTIC, Wood.KOA, Wood.KOA);
        List matchingGuitars = inventory.search(searchGuitar);
        if (!matchingGuitars.isEmpty()) {
            for (Iterator i = matchingGuitars.iterator(); i.hasNext();) {
                Guitar matchingGuitar = (Guitar) i.next();
                System.out.println(matchingGuitar.getSerialNumber() + " - " + matchingGuitar.getBuilder() + " - " + matchingGuitar.getModel() + " - " + matchingGuitar.getType() + " - " + matchingGuitar.getTopWood() + " - " + matchingGuitar.getBackWood());
            }
        }
    }

    public static void initializeInventory (Inventory inventory) {
        Guitar g1 = new Guitar("G1", 10.00, Builder.FENDER, "MASTER DESIGNED TRADITIONAL DREADNOUGHT RF", GuitarType.ACOUSTIC, Wood.ALDER,  Wood.ALDER);
        Guitar g2 = new Guitar("G2", 10.00, Builder.FENDER, "Eric Clapton Stratocaster", GuitarType.ELECTRIC,  Wood.REDWOOD,  Wood.REDWOOD);
        Guitar g3 = new Guitar("G3", 10.00, Builder.FENDER, "Sonoran™ SCE Thinline", GuitarType.ACOUSTIC,  Wood.ASH,  Wood.ASH);
        Guitar g4 = new Guitar("G4", 10.00, Builder.FENDER, "Jeff Beck Stratocaster", GuitarType.ELECTRIC,  Wood.BASSWOOD,  Wood.BASSWOOD);
        Guitar g5 = new Guitar("G5", 10.00, Builder.FENDER, "Malib CE", GuitarType.ACOUSTIC,  Wood.KOA,  Wood.KOA);
        Guitar g6 = new Guitar("G6", 10.00, Builder.FENDER, "Stevie Ray Vaughan Stratocaster", GuitarType.ELECTRIC,  Wood.MAHOGANY,  Wood.MAHOGANY);
        Guitar g7 = new Guitar("G7", 10.00, Builder.FENDER, "Redondo CE", GuitarType.ACOUSTIC,  Wood.MAKORE,  Wood.MAKORE);
        Guitar g8 = new Guitar("G8", 10.00, Builder.FENDER, "John Mayer Stratocaster", GuitarType.ELECTRIC,  Wood.MAPLE,  Wood.MAPLE);
        Guitar g9 = new Guitar("G9", 10.00, Builder.FENDER, "Newporter Mini with Gig Bag", GuitarType.ACOUSTIC,  Wood.INDIAN_ROSEWOOD,  Wood.INDIAN_ROSEWOOD);
        Guitar g10 = new Guitar("G10", 10.00, Builder.FENDER, "Buddy Guy Standard Stratocaster", GuitarType.ELECTRIC,  Wood.WALNUT,  Wood.WALNUT);

        inventory.addGuitar(g1);
        inventory.addGuitar(g2);
        inventory.addGuitar(g3);
        inventory.addGuitar(g4);
        inventory.addGuitar(g5);
        inventory.addGuitar(g6);
        inventory.addGuitar(g7);
        inventory.addGuitar(g8);
        inventory.addGuitar(g9);
        inventory.addGuitar(g10);
    }
}
