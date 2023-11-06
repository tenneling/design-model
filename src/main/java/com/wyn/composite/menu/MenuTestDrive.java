package com.wyn.composite.menu;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 10:36$
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent allItems = new Menu("All Menus");
        MenuComponent dinnerMenu = new Menu("Dinner Menus");
        MenuComponent lunchMenu = new Menu("Lunch Menus");
        allItems.add(lunchMenu);
        allItems.add(dinnerMenu);
        allItems.print();
    }
}

    