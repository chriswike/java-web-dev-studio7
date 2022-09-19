package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc {
    //this class is abstract and contains a field of all the disc properties
    private String name;
    private String discType;
    private int discStorage;
    private boolean isReWriteable;
    private ArrayList<String> contents;

    public BaseDisc (String aName, String aType, int discStorageSize, boolean aIsReWriteable ) {
        name = aName;
        discType = aType;
        discStorage = discStorageSize;
        isReWriteable = aIsReWriteable;
    }
}
