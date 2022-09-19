package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {


    // add the CD constructor
    // add some @overrides when cd is spun or read

    // TODO: Implement your custom interface.
public CD(String aName, String aType, int discStorageSize, boolean aIsReWriteable) {
    super(aName, aType, discStorageSize, aIsReWriteable);
}

    @Override
    public void spinDisc() {
        System.out.println("The CD is Spinning!");
    }

    @Override
    public void readData() {
        System.out.println("Read all of the CDs 700 megabytes!");
    }
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.



}
