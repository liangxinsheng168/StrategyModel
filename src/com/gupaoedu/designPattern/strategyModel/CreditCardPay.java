package com.gupaoedu.designPattern.strategyModel;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public class CreditCardPay implements Payment {

    @Override
    public void pay() {
        System.out.println("使用信用卡进行支付");
    }

}
