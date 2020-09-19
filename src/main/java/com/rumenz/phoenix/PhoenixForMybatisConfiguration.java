package com.rumenz.phoenix;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.phoenix.queryserver.client.Driver;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.rumenz.phoenix.mapper")
public class PhoenixForMybatisConfiguration {

    @Autowired
    private DataSourceProperties dataSourceProperties;

    @Bean
    public DataSource phoenixDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        //设置Phoenix驱动
        druidDataSource.setDriverClassName(Driver.class.getName());
        druidDataSource.setUrl(dataSourceProperties.getUrl());
        return druidDataSource;
    }
}