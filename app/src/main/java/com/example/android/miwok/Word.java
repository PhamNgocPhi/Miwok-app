package com.example.android.miwok;

/**
 * Created by phiph on 1/2/2018.
 */

public class Word {
    private String mDefaultTranlation;
    private  String mMiwokTranslation;
    private int resourceID = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mAudioResourceId;

    public Word(String mDefaultTranlation, String mMiwokTranslation, int mAudioResourceId) {
        this.mDefaultTranlation = mDefaultTranlation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mAudioResourceId = mAudioResourceId;
    }
    public Word(String mDefaultTranlation, String mMiwokTranslation, int resourceID, int mAudioResourceId) {
        this.mDefaultTranlation = mDefaultTranlation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.resourceID = resourceID;
        this.mAudioResourceId = mAudioResourceId;
    }
    public String getmDefaultTranlation() {
        return mDefaultTranlation;
    }

    public void setmDefaultTranlation(String mDefaultTranlation) {
        this.mDefaultTranlation = mDefaultTranlation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public void setmMiwokTranslation(String mMiwokTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public int getResourceID() {
        return resourceID;
    }

    public void setResourceID(int resourceID) {
        this.resourceID = resourceID;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    public boolean hasImage() {
        return resourceID != NO_IMAGE_PROVIDED;
    }
}
