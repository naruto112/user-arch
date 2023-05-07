package br.com.user.infrastructure.config;

import br.com.user.domain.adapters.services.UserServiceImp;
import br.com.user.domain.ports.interfaces.UserServicePort;
import br.com.user.domain.ports.repositories.UserRepositoryPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    UserServicePort userServicePort(UserRepositoryPort userRepositoryPort)
    {
        return  new UserServiceImp(userRepositoryPort);
    }
}
