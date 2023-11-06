package com.wyn.composite.menu;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 10:27$
 */
public abstract class MenuComponent {
    protected String name;
    public abstract void add(MenuComponent menuComponent);
    public abstract void print();
    public String getName(){
        return name;
    }
}

    