package br.com.user.adapter.controller;


import br.com.user.adapter.controller.model.SaveUserBodyDTO;
import br.com.user.adapter.controller.model.UserDto;
import br.com.user.application.port.controller.ChangeUserEndpointPort;
import br.com.user.application.usecase.SaveNewUserUseCase;
import br.com.user.domain.User;

public class ChangeUserEndPointAdapter implements ChangeUserEndpointPort {


    private final SaveNewUserUseCase saveNewUserUseCase;


    private  final UserDtoMapper userDtoMapper;

    ChangeUserEndPointAdapter(SaveNewUserUseCase saveNewUserUseCase, UserDtoMapper userDtoMapper) {
        this.saveNewUserUseCase = saveNewUserUseCase;
        this.userDtoMapper = userDtoMapper;
    }


    @Override
    public UserDto saverUser(SaveUserBodyDTO saveUserBodyDTO) {
        User user = userDtoMapper.toDomainFromSaveBody(saveUserBodyDTO);
        User savedUser = saveNewUserUseCase.saverUser(user);
        return userDtoMapper.toDto(savedUser);
    }
}
