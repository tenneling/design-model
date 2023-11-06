package com.wyn.generate.product;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 15:53$
 */
public class ConcreteBuilder extends Builder{

    protected Product product = new Product();

    @Override
    void first() {
        product.add("Hamburger",2);
    }

    @Override
    void second() {
        product.add("Drink",1);
    }

    @Override
    Product getProduct() {
        return this.product;
    }
}

    