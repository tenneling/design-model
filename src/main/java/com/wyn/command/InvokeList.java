package com.wyn.command;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @ClassName Invoke
 * @Description 命令请求者 可以添加不同类型的ICommand方法
 * @Author WENYANNI
 * @Date 2021/10/30 下午8:21
 **/
public class InvokeList {
    ArrayList<ICommand> arrayList = new ArrayList<>();

    public void add(ICommand iCommand){
        arrayList.add(iCommand);
    }

    public void execute(){
        for(int i=0;i<arrayList.size();i++){
            arrayList.get(i).sweep();
        }
    }
}
