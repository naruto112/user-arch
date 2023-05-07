package br.com.user.application.port.controller;

import br.com.user.adapter.controller.model.SaveUserBodyDTO;
import br.com.user.adapter.controller.model.UserDto;
import org.apache.catalina.User;

public interface ChangeUserEndpointPort {

    UserDto saverUser(SaveUserBodyDTO saveUserBodyDTO);
}
