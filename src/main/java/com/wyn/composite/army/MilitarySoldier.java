package com.wyn.composite.army;

import java.util.Iterator;

/**
 * @ClassName MilitarySoldier
 * @Description 叶节点
 * @Author WENYANNI
 * @Date 2021/11/21 下午3:43
 **/
public class MilitarySoldier implements MilitaryPerson {

    double salary;
    String name;

    MilitarySoldier(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public void add(MilitaryPerson person) {
        // TODO Auto-generated method stub

    }

    public void remove(MilitaryPerson person) {
        // TODO Auto-generated method stub

    }

    public MilitaryPerson getChild(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    public Iterator<MilitaryPerson> getAllChildren() {
        // TODO Auto-generated method stub
        return null;
    }

    public boolean isLeaf() {
        // TODO Auto-generated method stub
        return true;
    }

    public double getSalary() {
        // TODO Auto-generated method stub
        return salary;
    }

    public void setSalary(double salary) {
        // TODO Auto-generated method stub
        this.salary = salary;
    }

}
