package com.wx.mall.tiny01.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 */
@Configuration
@MapperScan("com.wx.mall.tiny01.mbg.mapper")
public class MyBatisConfig {
}
