package com.wyn.bridge.read;

import com.wyn.bridge.AbstactThing;

/**
 * @ClassName AbstarctThing
 * @Description 抽象事物类
 * @Author WENYANNI
 * @Date 2021/11/27 下午12:39
 **/
public class AbstarctThing {
    IRead iRead;

    public AbstarctThing(IRead iRead){
        this.iRead = iRead;
    }
    Object read() throws Exception{
        return iRead.read();
    }

}
