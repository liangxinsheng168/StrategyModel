package com.gupaoedu.designPattern.strategyModel;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public class StrategyModelTest {

    public static void main(String[] args) {

        Pay pay = new Pay();
        pay.pay("AliPay");
        pay.pay("WechatPay");
        pay.pay("CreditCardPay");

    }

}
