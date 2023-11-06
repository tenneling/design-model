package com.wyn.status.mobile;

/**
 * @ClassName CellContext
 * @Description 手机状态的上下文类
 * @Author WENYANNI
 * @Date 2021/11/14 下午5:48
 **/
public class CellContext {
    String phoneNo;
    String name;
    float price;

    CellContext(String phoneNo,String name,float price){
        phoneNo = this.phoneNo;
        name = this.name;
        price = this.price;
    }

    //存钱
    public void save(float price){
        this.price += price;
    }
    //通话扣费
    public void cost(int minute){
        this.price -=ICellStatus.COST_MINUTE * minute;
    }
    public boolean phone(){
        ICellStatus status = null;
        if (price > ICellStatus.NORMAL_LIMIT){
            status = new NormalCellStatus();
        }else if(price < ICellStatus.STOP_LIMIT){
            status = new StopCellStatus();
        }else{
            status = new OverCellStatus();
        }
        status.phone(this);
        return true;
    }
}
