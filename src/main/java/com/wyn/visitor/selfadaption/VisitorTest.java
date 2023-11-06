package com.wyn.visitor.selfadaption;

/**
 * @ClassName VisitorTest
 * @Description 自适应访问模式测试类
 * @Author WENYANNI
 * @Date 2021/10/31 下午8:28
 **/
public class VisitorTest {
    public static void main(String[] args) {
        ICBCSheet icbcSheet = new ICBCSheet("841221835","wen",10000,"2021-10-31",3);

        //订单单据访问者
        IVisitor v = new SheetVisitor();
        icbcSheet.accept(v);

        //定义工行对象
        ICBCBank icbcBank = new ICBCBank();
        //工行加一个单据
        icbcBank.add(icbcSheet);
        //对工行所有的单据进行自适应
        icbcBank.process(v);
    }

}
