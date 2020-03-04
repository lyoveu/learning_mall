package com.wx.mall.tiny.service;

import com.wx.mall.tiny.common.api.CommonResult;

/**
 * 验证码管理Service
 */
public interface AuthCodeService {

    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);

}
