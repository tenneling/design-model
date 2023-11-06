package com.wyn.responsibility.approve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 17:23$
 */
public class ClientTest {
    public static void main(String[] args) throws IOException {
        Congress Mary = new Congress();
        VicePresident Sam = new VicePresident();
        Director Larry = new Director();
        President Tammy = new President();
        Mary.setApprover(null);
        Sam.setApprover(Tammy);
        Tammy.setApprover(Mary);
        Larry.setApprover(Sam);
        PurchaseRequest request = new PurchaseRequest();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        request.amount = Double.parseDouble(bufferedReader.readLine()) ;
        Larry.processRequest(request);
    }
}

    