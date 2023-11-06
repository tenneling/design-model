package com.wyn.generate;

/**
 * @ClassName BuildProduct
 * @Description 生成器类
 * @Author WENYANNI
 * @Date 2021/10/30 上午10:54
 **/
public class BuildProduct implements IBuild{
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

    /**
     * 具体生产器多态create()方法
     * 多态方法调用其他创建Product对象的方法
     **/
    public Product create(){
        createUnit();
        createUnit2();
        createUnit3();
        return composite();
    }
}
