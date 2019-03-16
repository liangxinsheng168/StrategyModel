package com.gupaoedu.designPattern.strategyModel;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public class PayStrategy {

    private static Map<String, Payment> map = new HashMap<>();

    static {

        map.put(PayType.ALIPAY.getPayType(), new AliPay());
        map.put(PayType.WECHATPAY.getPayType(), new WechatPay());
        map.put(PayType.CREDITCARDPAY.getPayType(), new CreditCardPay());

    }

    public static Payment getInstance(String payType) {

        return map.get(payType);

    }

}
