package com.wyn.bridge.matrix;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 14:58$
 */
public class JPEG extends Image{
    @Override
    public void parseFile(String fileName) {
        impl.doPoint(new Matrix(fileName));
    }
}

    