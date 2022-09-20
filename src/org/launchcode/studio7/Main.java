package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD cd = new CD("A Video Game", "CD", 700, false);
        DVD dvd = new DVD ("A Movie", "DVD", 4300, false);

        // TODO: Call each CD and DVD method to verify that they work as expected.
        cd.spinDisc();
        cd.readData();

        dvd.spinDisc();
        dvd.readData();
    }
}
