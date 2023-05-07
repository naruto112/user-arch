package br.com.user.domain.adapters.services;

import br.com.user.domain.User;
import br.com.user.domain.dtos.UserDTO;
import br.com.user.domain.ports.interfaces.UserServicePort;
import br.com.user.domain.ports.repositories.UserRepositoryPort;

import java.util.List;
import java.util.stream.Collectors;

public class UserServiceImp implements UserServicePort {

    private final UserRepositoryPort userRepositoryPort;

    public UserServiceImp(UserRepositoryPort userRepositoryPort)
    {
        this.userRepositoryPort = userRepositoryPort;
    }


    @Override
    public List<UserDTO> buscaUser() {
        List<User> users = this.userRepositoryPort.buscarUsers();
        List<UserDTO> userDTOS = users.stream().map(User::toUserDTO).collect(Collectors.toList());
        return userDTOS;
    }
    @Override
    public void criarUser(UserDTO userDTO) {
        User user = new User(userDTO);
        this.userRepositoryPort.savedUser(user);
    }

    @Override
    public void atualizarUser(UserDTO userDTO) {

    }
}
