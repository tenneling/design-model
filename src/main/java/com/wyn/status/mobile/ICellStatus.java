package com.wyn.status.mobile;

/**
 * @InterfaceName ICellStatus
 * @Description 手机状态接口
 * @Author WENYANNI
 * @Date 2021/11/14 下午5:48
 **/
public interface ICellStatus {
    //手机状态有正常、透支、停机三种状态
    //手机功能有存款、电话

    float NORMAL_LIMIT = 0;
    float STOP_LIMIT = -1;
    float COST_MINUTE = 0.2f;

    boolean phone(CellContext cellContext);
}
