package com.rumenz.conf;

import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;


@Configuration
@MapperScan(basePackages = "com.rumenz.mapper.db2", sqlSessionFactoryRef = "db2SqlSessionFactory")
public class Db2MybatisConfig {
    
    @Bean("db2SqlSessionFactory")
    public SqlSessionFactory slaveSqlSessionFactory(@Qualifier("db2") DataSource dataSource) throws Exception {
        // 设置数据源
        MybatisSqlSessionFactoryBean mybatisSqlSessionFactoryBean = new MybatisSqlSessionFactoryBean();
        mybatisSqlSessionFactoryBean.setDataSource(dataSource);
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        //mapper的xml文件位置
        String locationPattern = "classpath*:/com/rumenz/xml/db2/*.xml";
        mybatisSqlSessionFactoryBean.setMapperLocations(resolver.getResources(locationPattern));
        //对应数据库的entity位置
        String typeAliasesPackage = "com.rumenz.entity.db2";
        mybatisSqlSessionFactoryBean.setTypeAliasesPackage(typeAliasesPackage);

        return mybatisSqlSessionFactoryBean.getObject();
    }
}
