package br.com.user.infrastructure.adapters.repositories;

import br.com.user.domain.User;
import br.com.user.domain.ports.repositories.UserRepositoryPort;
import br.com.user.infrastructure.adapters.entity.UserEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Component
public class UserRepository implements UserRepositoryPort {

    private final SpringUserRepository springUserRepository;

    public UserRepository(SpringUserRepository springUserRepository)
    {
        this.springUserRepository = springUserRepository;
    }

    @Override
    public List<User> buscarUsers() {
        List<UserEntity> userEntities = this.springUserRepository.findAll();
        return null;
    }

    @Override
    public User buscarUserId(UUID userId) {
        return null;
    }

    @Override
    public void savedUser(User user) {
        UserEntity userEntity = new UserEntity();

        if (Objects.isNull(user.getUserId()))
        {
            userEntity = new UserEntity(user);
        }

        if(Objects.nonNull(user.getUserId()))
        {
            userEntity = this.springUserRepository.findById(user.getUserId()).get();
            userEntity.updateUser(user);
        }

        this.springUserRepository.save(userEntity);
    }
}
