package com.gupaoedu.designPattern.strategyModel;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public class Pay {

    private Payment payment;

    public Pay() {}

    public void pay(String payType) {

        payment = PayStrategy.getInstance(payType);

        payment.pay();

    }

}
