package com.wyn.composite.army;

import java.util.Iterator;

/**
 * @ClassName ComputerSalary
 * @Description 工资计算类
 * @Author WENYANNI
 * @Date 2021/11/21 下午3:44
 **/
public class ComputerSalary {

    public static double computerSalary(MilitaryPerson person){
        double sum = 0;
        if(person.isLeaf() == true)
            sum = sum + person.getSalary();
        if(person.isLeaf() == false){
            sum = sum + person.getSalary();
            Iterator<MilitaryPerson> iterator = person.getAllChildren();
            while(iterator.hasNext()){
                MilitaryPerson p = iterator.next();
                sum = sum + computerSalary(p);
            }
        }
        return sum;
    }
}
