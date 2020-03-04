package com.wx.mall.tiny.controller;

import com.wx.mall.tiny.common.api.CommonResult;
import com.wx.mall.tiny.service.AuthCodeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 验证码管理Controller
 */
@Api(tags = "AuthCodeController", description = "验证码管理")
@RequestMapping("/sso")
@RestController
public class AuthCodeController {
    @Autowired
    private AuthCodeService authCodeService;

    @ApiOperation("获取验证码")
    @GetMapping("/getAuthCode")
    public CommonResult getAuthCode(@RequestParam String telephone) {
        return authCodeService.generateAuthCode(telephone);
    }

    @ApiOperation("判断验证码是否正确")
    @PostMapping("/verifyAuthCode")
    public CommonResult updatePassword(@RequestParam String telephone,
                                 @RequestParam String authCode) {
        return authCodeService.verifyAuthCode(telephone,authCode);
    }
}
