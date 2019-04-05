package com.cars.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

@EnableTransactionManagement
@PropertySource(value = "classpath:persistence.properties")
@Configuration
public class HibernateConfig {
    @Autowired
    private Environment env;

    @Bean
    public LocalSessionFactoryBean sessionFactory(DataSource dataSource){
        LocalSessionFactoryBean sf=new LocalSessionFactoryBean();
        sf.setDataSource(dataSource);
        sf.setHibernateProperties(properties());
        sf.setPackagesToScan("dto");
        return sf;
    }

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource=new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getProperty("jdbc.driverClassName"));
        dataSource.setDriverClassName(env.getProperty("jdbc.url"));
        dataSource.setDriverClassName(env.getProperty("jdbc.user"));
        dataSource.setDriverClassName(env.getProperty("jdbc.pass"));
        return dataSource;
    }

    private Properties properties(){
        Properties properties=new Properties();
        properties.put("hibernate.dialect", env.getProperty("hibernate.dialect"));
        properties.put("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
        properties.put("hibernate.format.sql", env.getProperty("hibernate.format.sql"));
        properties.put("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));


        return properties;
    }

}
