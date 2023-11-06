package com.wyn.composite.army;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @ClassName MilitaryOfficer
 * @Description 组合节点
 * @Author WENYANNI
 * @Date 2021/11/21 下午3:41
 **/
public class MilitaryOfficer implements MilitaryPerson {

    LinkedList<MilitaryPerson> list;
    String name;
    double salary;
    MilitaryOfficer(String name, double salary){
        this.name = name;
        this.salary = salary;
        list = new LinkedList<MilitaryPerson>();
    }
    public void add(MilitaryPerson person) {
        // TODO Auto-generated method stub
        list.add(person);
    }

    public void remove(MilitaryPerson person) {
        // TODO Auto-generated method stub
        list.remove(person);
    }

    public MilitaryPerson getChild(int index) {
        // TODO Auto-generated method stub
        return list.get(index);
    }

    public Iterator<MilitaryPerson> getAllChildren() {
        // TODO Auto-generated method stub
        return list.iterator();
    }

    public boolean isLeaf() {
        // TODO Auto-generated method stub
        return false;
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
