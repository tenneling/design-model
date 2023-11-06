package com.wyn.factory.factoryExampleT;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName ImageInfo
 * @Description 图像文件的基本信息
 * @Author WENYANNI
 * @Date 2021/10/24 下午8:43
 **/
@Getter
@Setter
@ToString
public class ImageInfo {
    private int width;
    private int height;
    private int r[][];
    private int g[][];
    private int b[][];

    public int[][] getR(){
        return r;
    }

    public int[][] getG(){
        return g;
    }

    public int[][] getB(){
        return b;
    }

    public void setRGB(int rgb[]){
        r = new int[height][width];
        g = new int[height][width];
        b = new int[height][width];

        int pos = 0;
        for(int i=0 ; i<height;i++){
            pos = width+1;
            for (int j=0;j<width;j++){
                r[i][j]= (rgb[pos+j]&0xff0000)>>16;
                g[i][j]= (rgb[pos+j]&0x00ff00)>>8;
                b[i][j]= rgb[pos+j]&0x0000ff;
            }
        }
    }
}
