package com.wyn.status.mobile;

/**
 * @ClassName StopCellStatus
 * @Description 停机状态
 * @Author WENYANNI
 * @Date 2021/11/14 下午6:00
 **/
public class StopCellStatus implements ICellStatus{
    @Override
    public boolean phone(CellContext cellContext) {
        System.out.println("手机处于停机状态");
        return false;
    }
}
