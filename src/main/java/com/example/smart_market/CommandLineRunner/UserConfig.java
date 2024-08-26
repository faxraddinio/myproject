package com.example.smart_market.CommandLineRunner;

import com.example.smart_market.Entity.UserEntity;
import com.example.smart_market.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@RequiredArgsConstructor
@Configuration
public class UserConfig {

    private final UserRepository userRepository;

    @Bean
    org.springframework.boot.CommandLineRunner commandLineRunner(){
        return args -> {
            UserEntity fakhri = new UserEntity(
                    "fakhri",
                    "faxraddin2004"
            );

            UserEntity fidan = new UserEntity(
                    "fidan",
                    "fidashka2005"
            );

            UserEntity fuad = new UserEntity(
                    "fuad",
                    "sancar1903"
            );

            UserEntity omar = new UserEntity(
                    "omar",
                    "munush1984"
            );

            userRepository.save(fakhri);
            userRepository.save(fidan);
            userRepository.save(fuad);
            userRepository.save(omar);

        };
    }
}
