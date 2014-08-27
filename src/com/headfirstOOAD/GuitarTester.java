package com.headfirstOOAD;



public class GuitarTester {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Guitar guitar = inventory.getGuitar("G1");

        System.out.println(guitar.getSerialNumber() + " - " + guitar.getBuilder() + " - " + guitar.getModel() + " - " + guitar.getType() + " - " + guitar.getTopWood() + " - " + guitar.getBackWood());

        Guitar searchGuitar = new Guitar("G5", 10.00, "Fender", "Malib CE", "Acoustic", "Figured Koa", "Figured Koa");

        Guitar resultGuitar = inventory.search(searchGuitar);

        if (resultGuitar != null) {
            System.out.println(guitar.getSerialNumber() + " - " + guitar.getBuilder() + " - " + guitar.getModel() + " - " + guitar.getType() + " - " + guitar.getTopWood() + " - " + guitar.getBackWood());
        }

    }

    public static void initializeInventory (Inventory inventory) {
        Guitar g1 = new Guitar("G1", 10.00, "Fender", "MASTER DESIGNED TRADITIONAL DREADNOUGHT RF", "Acoustic", "Alder", "Alder");
        Guitar g2 = new Guitar("G2", 10.00, "Fender", "Eric Clapton Stratocaster", "Electric", "Redwood", "Redwood");
        Guitar g3 = new Guitar("G3", 10.00, "Fender", "Sonoran™ SCE Thinline", "Acoustic", "Ash ", "Ash ");
        Guitar g4 = new Guitar("G4", 10.00, "Fender", "Jeff Beck Stratocaster", "Electric", "Basswood ", "Basswood ");
        Guitar g5 = new Guitar("G5", 10.00, "Fender", "Malib CE", "Acoustic", "Figured Koa", "Figured Koa");
        Guitar g6 = new Guitar("G6", 10.00, "Fender", "Stevie Ray Vaughan Stratocaster", "Electric", "Mahogany ", "Mahogany ");
        Guitar g7 = new Guitar("G7", 10.00, "Fender", "Redondo CE", "Acoustic", "Makore ", "Makore ");
        Guitar g8 = new Guitar("G8", 10.00, "Fender", "John Mayer Stratocaster", "Electric", "Spalted Maple", "Spalted Maple");
        Guitar g9 = new Guitar("G9", 10.00, "Fender", "Newporter Mini with Gig Bag", "Acoustic", "Indian Rosewood", "Indian Rosewood");
        Guitar g10 = new Guitar("G10", 10.00, "Fender", "Buddy Guy Standard Stratocaster", "Electric", "Walnut", "Walnut");

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
