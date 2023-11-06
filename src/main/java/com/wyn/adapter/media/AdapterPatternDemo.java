package com.wyn.adapter.media;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 16:46$
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlay audioPlay = new AudioPlay();
        audioPlay.play("mp3","test.mp3");
        audioPlay.play("mp4","a.mp4");
        audioPlay.play("vlc","b.vlc");
    }
}

    