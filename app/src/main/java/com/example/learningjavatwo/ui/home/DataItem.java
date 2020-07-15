package com.example.learningjavatwo.ui.home;

 class DataItem {
      int mImageResource;
      String mText1;

     DataItem (int imageResource,String text1)
    {
        mImageResource = imageResource;
        mText1 = text1;
    }
    public int getImageResource() {
        return mImageResource;
    }
    public String getText1() {
        return mText1;
    }
}
