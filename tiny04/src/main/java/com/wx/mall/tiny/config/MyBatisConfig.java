package com.wx.mall.tiny.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 */
@Configuration
@MapperScan({"com.wx.mall.tiny.mbg.mapper","com.wx.mall.tiny.dao"})
public class MyBatisConfig {
}
