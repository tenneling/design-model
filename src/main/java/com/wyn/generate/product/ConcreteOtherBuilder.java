package com.wyn.generate.product;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 16:01$
 */
public class ConcreteOtherBuilder extends Builder{
    protected Product product = new Product();

    @Override
    void first() {
        product.add("Hamburger",1);
    }

    @Override
    void second() {
        product.add("Drink",2);
    }

    @Override
    Product getProduct() {
        return this.product;
    }
}

    