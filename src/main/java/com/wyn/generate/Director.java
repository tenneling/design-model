package com.wyn.generate;

/**
 * @ClassName Director
 * @Description 指挥者类，对生成器接口的封装
 * @Author WENYANNI
 * @Date 2021/10/30 上午10:57
 **/
public class Director {

    /**
     * IBuild是流程控制接口，该接口定义的方法必须按照某种顺序运行
     * Director是IBuild接口的封装类，其中的build()决定了具体的流程控制过程
     **/

    private IBuild iBuild;
    public Director (IBuild iBuild){
        this.iBuild = iBuild;
    }

    public Product build(){
        iBuild.createUnit();
        iBuild.createUnit2();
        iBuild.createUnit3();
        return iBuild.composite();
    }

    public static void main(String[] args) {
        IBuild iBuild = new BuildProduct();
        Director director = new Director(iBuild);
        Product product = director.build();
    }
}
