package com.chance.bridge.example01;

import java.math.BigDecimal;

/**
 * 支付接口
 */
public class PayController {
    /**
     * 支付功能
     * @param uId          用户ID
     * @param tradeId      交易ID
     * @param amount       交易金额
     * @param channelType  渠道类型 微信 or 支付宝
     * @param modeType     支付类型 密码 or 人脸 or 指纹
     * @return boolean
     */
    public boolean doPay(String uId, String tradeId, BigDecimal amount, int channelType, int modeType) {
        if (channelType == 1) {
            //微信支付
            System.out.println("微信渠道支付开始");
            if (modeType == 1) {
                System.out.println("密码支付");
            } else if (modeType == 2) {
                System.out.println("人脸支付");
            } else if (modeType == 3) {
                System.out.println("指纹支付");
            }
        } else if (channelType == 2) {
            // 支付宝
            System.out.println("支付宝渠道支付开始");
            if (modeType == 1) {
                System.out.println("密码支付");
            } else if (modeType == 2) {
                System.out.println("人脸支付");
            } else if (modeType == 3) {
                System.out.println("指纹支付");
            }
        }
        return true;
    }
}
