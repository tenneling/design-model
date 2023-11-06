package com.wyn.responsibility.approve;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 17:18$
 */
public class Approver {

    private Approver approver;

    public Approver(){
        approver = null;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    public void processRequest(PurchaseRequest purchaseRequest){
        if (approver != null){
            approver.processRequest(purchaseRequest);
        }
    }
}

    