package com.wyn.composite.army;

import java.util.Iterator;

/**
 * @ClassName MilitaryPerson
 * @Description 抽象节点类
 * @Author WENYANNI
 * @Date 2021/11/21 下午3:40
 **/
public interface MilitaryPerson {
    public void add(MilitaryPerson person);
    public void remove(MilitaryPerson person);
    public MilitaryPerson getChild(int index);
    public Iterator<MilitaryPerson> getAllChildren();
    public boolean isLeaf();
    public double getSalary();
    public void setSalary(double salary);
}
