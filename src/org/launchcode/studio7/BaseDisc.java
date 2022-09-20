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
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public int getDiscStorage() {
        return discStorage;
    }

    public void setDiscStorage(int discStorage) {
        this.discStorage = discStorage;
    }

    public boolean isReWriteable() {
        return isReWriteable;
    }

    public void setReWriteable(boolean reWriteable) {
        isReWriteable = reWriteable;
    }

}
