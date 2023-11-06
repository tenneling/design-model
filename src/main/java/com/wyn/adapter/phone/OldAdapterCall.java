package com.wyn.adapter.phone;

/**
 * @ClassName OldAdapterCall
 * @Description 旧手机适配器
 * @Author WENYANNI
 * @Date 2021/11/21 下午1:25
 **/
public class OldAdapterCall extends AbstractNewCall{
    OldCall oldCall;

    OldAdapterCall(OldCall call){
        this.oldCall = call;
    }

    public void phone(){
        oldCall.call();
    }

    public void message(){
        oldCall.msg();
    }
}
