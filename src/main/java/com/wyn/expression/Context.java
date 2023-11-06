package com.wyn.expression;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Context
 * @Description 上下文类，环境类,用于存储解释器之外的一些全局信息，通常它临时存储了一些需要解释的语句
 * @Author WENYANNI
 * @Date 2021/11/20 下午1:45
 **/
public class Context {
    Map<String,Double> map = new HashMap<>();
    void assign(String key,Double value){
        map.put(key,value);
    }
}
