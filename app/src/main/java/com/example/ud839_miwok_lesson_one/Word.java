package com.example.ud839_miwok_lesson_one;

public class Word {

    private final String mDefaultTranslation;
    private final String mMiwokTranslation;

    //constructor
    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    //methods to be revoked from outside
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

}
