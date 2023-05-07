package br.com.user.domain.ports.repositories;

import br.com.user.domain.User;

import java.util.List;
import java.util.UUID;

public interface UserRepositoryPort {

    List<User> buscarUsers();

    User buscarUserId(UUID userId);

    void savedUser(User user);

}
