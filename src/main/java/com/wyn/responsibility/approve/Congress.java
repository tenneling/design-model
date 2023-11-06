package com.wyn.responsibility.approve;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 17:20$
 */
public class Congress extends Approver{
    public void processRequest(PurchaseRequest request){
        if(request.amount>=50000){
            //
        }else {
            super.processRequest(request);
        }
    }
}

    