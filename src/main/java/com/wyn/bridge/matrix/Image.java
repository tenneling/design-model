package com.wyn.bridge.matrix;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 14:52$
 */
public abstract class Image {

    protected ImageImpl impl;

    public void setImpl(ImageImpl impl){
        this.impl = impl;
    }

    public abstract  void parseFile(String fileName);
}

    