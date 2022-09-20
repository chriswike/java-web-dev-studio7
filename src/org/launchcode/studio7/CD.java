package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {


    // add the CD constructor
    // add some @overrides when cd is spun or read
public CD(String aName, String aType, int discStorageSize, boolean aIsReWriteable) {
    super(aName, aType, discStorageSize, aIsReWriteable);
}
    @Override
    public void spinDisc() {
        System.out.println("The CD is Spinning!");
    }
    @Override
    public void readData() {
        System.out.println("Reading all of the CDs 700 megabytes!");
    }
}
