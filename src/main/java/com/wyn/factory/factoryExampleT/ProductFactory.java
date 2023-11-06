package com.wyn.factory.factoryExampleT;

/**
 * @ClassName ProductFactory
 * @Description 泛型工厂
 * @Author WENYANNI
 * @Date 2021/10/26 上午12:24
 **/
public class ProductFactory<T> {
    T create(String className){
        T product = null;
        try {
            Class c = Class.forName(className);
            product = (T)c.newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return product;
    }
}
