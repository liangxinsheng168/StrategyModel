package com.gupaoedu.designPattern.strategyModel;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public enum PayType {

    ALIPAY("AliPay"),WECHATPAY("WechatPay"),CREDITCARDPAY("CreditCardPay");

    private String payType;

    private PayType (String payType) {

        this.payType = payType;

    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

}
