package com.wyn.generate.product;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 15:56$
 */
@Setter
@Getter
@ToString
public class Product {

    List<Product> productList = new ArrayList<>();

    String name;

    int value;

    public void add(String name,int value){
        this.name = name;
        this.value = value;
    }

    void showToClient(){
        for(Product product:productList){
            System.out.println(product.getName()+"---------"+product.getValue());
        }
    }
}

    