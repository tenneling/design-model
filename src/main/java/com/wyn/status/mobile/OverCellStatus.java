package com.wyn.status.mobile;

/**
 * @ClassName OverCellStatus
 * @Description 透支状态
 * @Author WENYANNI
 * @Date 2021/11/14 下午5:59
 **/
public class OverCellStatus implements ICellStatus{
    @Override
    public boolean phone(CellContext cellContext) {
        System.out.println("手机处于透支状态");
        int minute = (int)(Math.random()*10+1);
        cellContext.cost(minute);
        return false;
    }
}
