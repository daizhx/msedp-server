package com.edp.server.config.datasource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@Configuration
@Primary
public class DataSourceConfig {

    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.driver-class-userName}")
    private String driverClassName;

    @Value("${spring.datasource.username}")
    private String userName;

    @Value("${spring.datasource.password}")
    private String password;

    @Bean
    public DataSource dataSource(){
        int index1 = url.lastIndexOf("/");
        int index2 = url.indexOf("?");

        String url01 = url.substring(0,index1) + url.substring(index2,url.length());
        System.out.println(url01);
        String dbName = url.substring(index1+1,index2);
        System.out.println(dbName);


        Connection connection = null;
        Statement st = null;
        try {
            Class.forName(driverClassName);
            connection = DriverManager.getConnection(url01,userName,password);
            st = connection.createStatement();

            //create db
            st.executeUpdate("CREATE DATABASE IF NOT EXISTS " + dbName + ";");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {

            if(connection != null){
                try {
                    if(st != null) {
                        st.close();
                    }
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        DataSource dataSource = DataSourceBuilder.create()
                .url(url)
                .driverClassName(driverClassName)
                .username(userName)
                .password(password)
                .build();

        return dataSource;
    }
}
