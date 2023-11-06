package com.wyn.memento;

import com.wyn.intermediary.Mediator;

import java.io.*;

/**
 * @ClassName Caretaker
 * @Description 备忘录管理类，负责管理保存备忘录的对象
 * @Author WENYANNI
 * @Date 2021/11/14 下午1:28
 **/
public class Caretaker {
    File file;
    String filePath;

    Caretaker(){
        filePath = this.getClass().getResource("/").getPath();
        file = new File(filePath+"/Mymeme.txt");
    }

    //负责读取备忘录文件并恢复备忘录对象
    public Memento getMemento(){
        Memento memento = new Memento();
        if (file.exists()){
            try{
                FileInputStream fileInputStream = new FileInputStream(filePath+"/Mymeme.txt");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                memento = (Memento) objectInputStream.readObject();
                fileInputStream.close();
                objectInputStream.close();
            }catch (Exception e){

            }
        }
        return memento;
    }

    //将备忘录对象保存到文件中
    public void saveMemento(Memento memento){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(filePath+"/Mymeme.txt");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(memento);
        }catch (Exception e){

        }
    }
}
