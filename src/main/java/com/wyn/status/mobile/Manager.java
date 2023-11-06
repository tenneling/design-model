package com.wyn.status.mobile;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Manager
 * @Description CellContext对象的集合管理类
 * @Author WENYANNI
 * @Date 2021/11/14 下午6:21
 **/
public class Manager {
    private Map<String,CellContext> map = new HashMap<>();

    //注册新用户
    public boolean register(CellContext context){
        map.put(context.phoneNo,context);
        return true;
    }

    //往手机号为phoneNo，存入money
    public void save(String phoneNo,float money){
        CellContext context = map.get(phoneNo);
        context.save(money);
    }

    //手机号phoneNo，打电话
    public boolean request(String phoneNo){
        CellContext context = map.get(phoneNo);
        context.phone();
        return true;
    }
}
