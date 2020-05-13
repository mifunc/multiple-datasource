package com.rumenz.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;


@Configuration
@PropertySource("classpath:application.properties")
public class DatasourceConfig {
    @Bean("db1")
    @ConfigurationProperties(prefix = "spring.datasource.db1")
    public DataSource masterDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean("db2")
    @ConfigurationProperties(prefix = "spring.datasource.db2")
    public DataSource slaveDataSource(){
        return DataSourceBuilder.create().build();
    }

}
