package org.demo.springboot.app.common.config;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
@ConfigurationProperties(prefix = "spring.datasource")
public class DatasourceConfig {

    private static final Logger logger = LoggerFactory.getLogger(DatasourceConfig.class);

    private String url;
    private String driverClassName;
    private String username;
    private String password;

    @Bean(name = "dataSource")
    public DataSource dataSource() {
        logger.info("url: {}", url);
        logger.info("driverClassName: {}", driverClassName);
        logger.info("username: {}", username);
        logger.info("password: {}", password);

        // @formatter:off
        final var builder = DataSourceBuilder.create()
                .url(url)
                .driverClassName(driverClassName)
                .username(username)
                .password(password);
        // @formatter:on
        return builder.build();
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
