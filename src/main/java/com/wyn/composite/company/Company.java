package com.wyn.composite.company;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 10:41$
 */
public abstract class Company {

    protected String name;

    public Company(String name){
        this.name = name;
    }

    public abstract void add(Company company);

    public abstract void delete(Company company);

}

    