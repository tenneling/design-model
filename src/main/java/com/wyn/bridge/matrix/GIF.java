package com.wyn.bridge.matrix;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 14:57$
 */
public class GIF extends Image{
    @Override
    public void parseFile(String fileName) {
        impl.doPoint(new Matrix(fileName));
    }
}

    