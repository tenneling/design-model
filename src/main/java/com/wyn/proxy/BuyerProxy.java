package com.wyn.proxy;

/**
 * @ClassName BuyerProxy
 * @Description 代理角色，内部含有对真实对象的引用，从而可以操作真实对象
 * @Author WENYANNI
 * @Date 2021/11/21 下午7:37
 **/
public class BuyerProxy implements ITv{

    private Buyer buyer;

    BuyerProxy(Buyer buyer){
        this.buyer = buyer;
    }

    @Override
    public void buyTv() {
        preProcess();
        buyer.buyTv();
        postProcess();
    }

    public void postProcess() {
    }

    public void preProcess() {
    }
}
