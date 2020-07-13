package com.xl.apps.cms.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.xl.apps.cms.dao")
public class MybatisConfig {

}
