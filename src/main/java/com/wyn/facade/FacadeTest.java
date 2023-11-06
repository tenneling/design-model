package com.wyn.facade;

/**
 * @ClassName FacadeTest
 * @Description 外观模式测试类
 * @Author WENYANNI
 * @Date 2021/11/27 下午8:18
 **/
public class FacadeTest {
    public static void main(String[] args) {
        Refrigerator refrigerator = new Refrigerator();
        refrigerator.init();
        refrigerator.run();
        refrigerator.shutdown();
    }

    /**
     * Facade:门面角色，外观模式的核心，被客户角色调用，熟悉子系统的功能。内部根据客户角色的需求预定了几种功能的组合
     * SubSystem:子系统角色，实现了子系统的功能。它对客户角色和Facade是未知的
     * Client:客户角色，通过调用Facade来完成要实现的功能
     *
     **/
}
