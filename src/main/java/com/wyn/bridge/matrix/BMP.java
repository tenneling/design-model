package com.wyn.bridge.matrix;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 14:55$
 */
public class BMP extends Image{
    @Override
    public void parseFile(String fileName) {
        impl.doPoint(new Matrix(fileName));
    }
}

    