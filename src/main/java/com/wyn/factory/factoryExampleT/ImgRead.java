package com.wyn.factory.factoryExampleT;

import lombok.SneakyThrows;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;

/**
 * @ClassName ImgRead
 * @Description 图像文件读取类
 * @Author WENYANNI
 * @Date 2021/10/24 下午8:37
 **/
public class ImgRead implements IRead<ImageInfo>{

    public ImageInfo read(String... in) {
       //in[0] 文件名称
        File file = new File(in[0]);
        BufferedImage bi = null;
        try {
            bi = ImageIO.read(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        int width = bi.getWidth();
        int height = bi.getHeight();
        int rgb[] = new int[width*height];

        //将图像数据读到result缓冲区
        bi.getRGB(0,0,width,height,rgb,width,width);

        //设置图像信息
        ImageInfo obj = new ImageInfo();
        obj.setWidth(width);
        obj.setHeight(height);
        obj.setRGB(rgb);

        return obj;
    }
}
