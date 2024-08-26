package com.example.smart_market;

import com.example.smart_market.Entity.UserEntity;
import com.example.smart_market.Repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class SmartMarketApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartMarketApplication.class, args);
    }
}
