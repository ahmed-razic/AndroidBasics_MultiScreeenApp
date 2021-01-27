package com.example.android.multiscreenapp;

public class Word {

    private final String mMiwokTranslation;
    private final String mDefaultTranslation;

    public Word(String miwokWord, String defaultWord) {
        mMiwokTranslation = miwokWord;
        mDefaultTranslation = defaultWord;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
}
