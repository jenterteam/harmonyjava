package com.javamg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author MustafaGungor
 * @version 1.0.0
 * @since 10.06.2017
 */
@Configuration
@SpringBootApplication
@EntityScan(basePackages = {"com.javamg.entity"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
