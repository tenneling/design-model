package com.wyn.status.mobile;

/**
 * @ClassName CellManagerTest
 * @Description 测试类
 * @Author WENYANNI
 * @Date 2021/11/14 下午6:35
 **/
public class CellManagerTest {
    public static void main(String[] args) {
        CellContext cellContext = new CellContext("19129417261","wen",50);

        Manager manager = new Manager();
        manager.register(cellContext);
        manager.request("19129417261");
        manager.request("19129417261");
        manager.save("19129417261",30);
        manager.request("19129417261");
        manager.request("19129417261");
    }
}
