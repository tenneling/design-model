package com.wyn.composite.menu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 10:33$
 */
public class Menu extends MenuComponent{

    private List<MenuComponent> menuComponents = new ArrayList<>();

    public Menu(String name){
        this.name = name;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponent.add(menuComponent);
    }

    @Override
    public void print() {
        System.out.println("\n"+getName());
        System.out.println(","+"-------------");
        Iterator iterator = menuComponents.iterator();
        while(iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent)iterator.next();
            menuComponent.print();
        }
    }
}

    