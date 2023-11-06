package com.wyn.status.mobile;

/**
 * @ClassName CellTest
 * @Description 测试类
 * @Author WENYANNI
 * @Date 2021/11/14 下午6:02
 **/
public class CellTest {
    public static void main(String[] args) {
        CellContext cellContext = new CellContext("19129417261","wen",50);
        cellContext.phone();
        cellContext.phone();
        cellContext.save(4);
        cellContext.phone();
        cellContext.phone();
        cellContext.phone();
    }
}
