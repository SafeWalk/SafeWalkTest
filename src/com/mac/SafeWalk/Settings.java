package com.mac.SafeWalk;

import android.content.SharedPreferences;

/**
 * Utilities class that keeps track of global variables. It is a singleton so there
 * is only one instance of this class.
 */
public class Settings {

    private static final Settings settings = new Settings();


    private String pickUpLocation;
    private long lastSendTime = 0;
    private final static String SAFEWALK_PHONE_NUMBER = "6123237668"; //"6512420083";  //Currently Kohei's number

    // Phone and name data
    private SharedPreferences nameData;
    private SharedPreferences phoneData;

    // Where to save the name and phone data
    private static String filename = "MyName";
    private static String phoneFile = "MyPhoneNumber";

    private void Settings() {}

    public static Settings getSettings() {
        return settings;
    }

    public String getPickUpLocation() {
        return pickUpLocation;
    }

    public void setPickUpLocation(String pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }

    public static String getSafewalkPhoneNumber() {
        return SAFEWALK_PHONE_NUMBER;
    }

    public SharedPreferences getNameData(){
        return nameData;
    }

    public void setNameData(SharedPreferences content) {
        this.nameData = content;
    }

    public SharedPreferences getPhoneData(){
        return this.phoneData;
    }

    public void setPhoneData(SharedPreferences content) {
        this.phoneData = content;
    }

    public static String getFilename() {
        return filename;
    }

    public static String getPhoneFile() {
        return phoneFile;
    }

    public long getLastSendTime() {
        return lastSendTime;
    }

    public void setLastSendTime(long lastSendTime) {
        this.lastSendTime = lastSendTime;
    }
}
