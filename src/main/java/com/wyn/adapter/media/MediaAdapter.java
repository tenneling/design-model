package com.wyn.adapter.media;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 16:37$
 */
public class MediaAdapter implements MediaPlayer{

    protected AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType){
        if ("vlc".equalsIgnoreCase(audioType)){
            advancedMediaPlayer = new VlcPlayer();
        }
        if("mp4".equalsIgnoreCase(audioType)){
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if ("vlc".equalsIgnoreCase(audioType)){
            advancedMediaPlayer.playVlc(fileName);
        }
        if("mp4".equalsIgnoreCase(audioType)){
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}

    