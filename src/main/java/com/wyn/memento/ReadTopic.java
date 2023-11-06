package com.wyn.memento;

import java.io.RandomAccessFile;

/**
 * @ClassName ReadTopic
 * @Description Originator原发者，负责创建一个备忘录来记录当前对象的内部状态，并可使用备忘录恢复内部状态
 * @Author WENYANNI
 * @Date 2021/11/14 下午1:52
 **/
public class ReadTopic {
    private long pos;
    private String filePath;
    private RandomAccessFile inFile;

    //负责打开题目文件
    public ReadTopic(){
        filePath = this.getClass().getResource("/").getPath();
        try {
            inFile = new RandomAccessFile(filePath+"/MyTopic.txt","rw");
        }catch (Exception e){

        }
    }

    //根据备忘录对象获得上次答题的断点位置，并将文件指针定位在该断点处
    public void restoreFromMe(Memento memento){
        pos = memento.getPos();
        try {
            inFile.seek(pos);
        }catch (Exception e){

        }
    }

    //负责将当前答题位置封装成备忘录对象，以备保存
    public Memento createMemento(){
        try{
            pos = inFile.getFilePointer();
        }catch (Exception e){

        }
        Memento memento =new Memento();
        memento.setPos((int)pos);
        return memento;
    }

    //获取当前答题题目
    public String getNextTopic(){
        String s = null;
        try {
            s = inFile.readLine();
        }catch (Exception e){

        }
        return  s;
    }

    //关闭答题文件，停止答题
    public void close(){
        try{
            inFile.close();
        }catch (Exception e){

        }
    }
}
