package com.wyn.prototype;

import java.util.Hashtable;

/**
 * @ClassName PrototypeManager
 * @Description 原型管理器，可以添加原型对象，也可以获得原型对象
 * @Author WENYANNI
 * @Date 2021/10/30 下午2:11
 **/
public class PrototypeManager {
    //用于存储原型对象
    private Hashtable ht = new Hashtable();
    private static PrototypeManager pm = new PrototypeManager();

    public void addPrototype(String key,Object obj){
        ht.put(key,obj);
    }

    public Object getPrototype(String key){
        return ht.get(key);
    }

    public static PrototypeManager getPrototypeManager(){
        return pm;
    }
}
