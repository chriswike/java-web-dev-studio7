package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {

    // TODO: Implement your custom interface.
    public DVD(String aName, String aType, int discStorageSize, boolean aIsReWriteable) {
        super(aName, aType, discStorageSize, aIsReWriteable);
    }

    @Override
    public void spinDisc() {
        System.out.println("The DVD is Spinning!");
    }
    @Override
    public void readData() {
        System.out.println("Reading all of the DVDs 4.3 gigabytes");
    }
}
