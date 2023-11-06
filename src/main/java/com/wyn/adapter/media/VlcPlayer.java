package com.wyn.adapter.media;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 16:32$
 */
public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("-----------playing vlc--------,fileName:"+fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //System.out.println("-----------playing mp4--------,fileName:"+fileName);
    }
}

    