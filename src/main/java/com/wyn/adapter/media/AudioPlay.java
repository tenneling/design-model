package com.wyn.adapter.media;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 16:41$
 */
public class AudioPlay implements MediaPlayer{

    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if ("mp3".equalsIgnoreCase(audioType)){
            System.out.println("-----------playing mp3--------,fileName:"+fileName);
        }
        if("mp4".equalsIgnoreCase(audioType) || "vlc".equalsIgnoreCase(audioType)){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        }else{
            System.out.println("Invalid media:"+audioType+"format not supported");
        }
    }
}

    