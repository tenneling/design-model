package com.wyn.factory.simpleFactory;

/**
 * @ClassName CarSimpleFactory
 * @Description 小汽车的简单工厂 可以直接看出创建产品种类的数目
 * @Author WENYANNI
 * @Date 2021/10/24 下午7:10
 **/
public class CarSimpleFactory {
    /**
     * 定制抽象产品接口
     * 定制具体产品子类
     * 定制工厂类
     **/

    public static final String UPTYPE = "UPCAR";
    public static final String MIDTYPE = "MIDCAR";
    public static final String DNTYPE = "DNCAR";

    public  static ICar create (String mark){
        ICar obj = null;
        if(UPTYPE.equals(mark)){
            obj = new UpCar();
        }else if (MIDTYPE.equals(mark)){
            obj = new MidCar();
        }else if (DNTYPE.equals(mark)){
            obj = new DnCar();
        }
        return obj;
    }

    public static void main(String[] args) {
        ICar obj = CarSimpleFactory.create("UPCAR");
    }
}
