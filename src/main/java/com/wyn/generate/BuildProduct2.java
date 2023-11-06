package com.wyn.generate;

/**
 * @ClassName BuildProduct
 * @Description 生成器类2
 * @Author WENYANNI
 * @Date 2021/10/30 上午10:54
 **/
public class BuildProduct2 implements IBuild{
    @Override
    public void createUnit() {

    }

    @Override
    public void createUnit2() {

    }

    @Override
    public void createUnit3() {

    }

    @Override
    public Product composite() {
        Product product = new Product();
        //关联U1 U2 U3
        return product;
    }
}
