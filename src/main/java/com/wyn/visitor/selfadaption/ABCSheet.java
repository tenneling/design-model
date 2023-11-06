package com.wyn.visitor.selfadaption;

/**
 * @ClassName ABCSheet
 * @Description 农行存单类
 * @Author WENYANNI
 * @Date 2021/10/31 下午8:12
 **/
public class ABCSheet extends Sheet{
    public ABCSheet(String account, String name, float money, String startDate, int range) {
        super(account, name, money, startDate, range);
    }
}
