package com.wyn.generate.product;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 16:04$
 */
public class ClientTest {
    public static void main(String[] args) {
        DirectorCashier cashier = new DirectorCashier();
        ConcreteBuilder builder =new ConcreteBuilder();
        cashier.buildFood(builder);
        builder.getProduct().showToClient();
    }
}

    