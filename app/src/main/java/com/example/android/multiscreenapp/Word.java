package com.example.android.multiscreenapp;

public class Word {

    private final String mMiwokTranslation;
    private final String mDefaultTranslation;
    private int mImageResourceID = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String miwokWord, String defaultWord) {
        mMiwokTranslation = miwokWord;
        mDefaultTranslation = defaultWord;
    }
    public Word(String miwokWord, String defaultWord, int imageResourceID) {
        mMiwokTranslation = miwokWord;
        mDefaultTranslation = defaultWord;
        mImageResourceID = imageResourceID;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
    public int getImageResourceID() { return mImageResourceID; }

    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }
}
