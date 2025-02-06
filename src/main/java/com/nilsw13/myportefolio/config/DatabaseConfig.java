package com.nilsw13.myportefolio.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {

    private Environment env ;

    public DatabaseConfig(Environment env) {
        this.env = env;
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.sqlite.JDBC");

        String dbPath = System.getenv("DATABASE_PATH");
        if (dbPath == null) {
            // en local
            dbPath = "myportefolio.db";

        } else {
            // en production
            dbPath = "/tmp/myportefolio.db";
        }

        dataSource.setUrl("jdbc:sqlite:" + dbPath);
        return dataSource;
    }
}
