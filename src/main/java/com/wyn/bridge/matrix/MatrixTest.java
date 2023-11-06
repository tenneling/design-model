package com.wyn.bridge.matrix;

/**
 * @ Description:
 *
 * 现假设该系统需要支持10种格式的图像文件和5种操作系统，不考虑类Matrix和类MatrixTest
 * 若采用桥接模式则至少设计17个类
 *
 *
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 14:58$
 */
public class MatrixTest {
    public static void main(String[] args) {
        Image image = new BMP();
        ImageImpl impl = new WindowsImpl();
        image.setImpl(impl);
        image.parseFile("demo.bmp");
    }
}

    