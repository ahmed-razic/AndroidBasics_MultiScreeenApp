package com.example.android.multiscreenapp;

public class Word {

    private final String mMiwokTranslation;
    private final String mDefaultTranslation;
    private final int mAudioResourceId;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String miwokWord, String defaultWord, int audioResourceId) {
        mMiwokTranslation = miwokWord;
        mDefaultTranslation = defaultWord;
        mAudioResourceId = audioResourceId;
    }
    public Word(String miwokWord, String defaultWord, int imageResourceID, int audioResourceId) {
        mMiwokTranslation = miwokWord;
        mDefaultTranslation = defaultWord;
        mImageResourceId = imageResourceID;
        mAudioResourceId = audioResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mAudioResourceId=" + mAudioResourceId +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
    public int getImageResourceId() { return mImageResourceId; }
    public int getAudioResourceId() { return mAudioResourceId; }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
