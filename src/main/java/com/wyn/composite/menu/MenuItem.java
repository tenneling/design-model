package com.wyn.composite.menu;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 10:29$
 */
public class MenuItem extends MenuComponent{
    private double price;

    public MenuItem(String name,double price){
        this.name = name;
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        return;
    }

    @Override
    public void print() {
        System.out.println(""+getName());
        System.out.println(""+getPrice());
    }
}

    