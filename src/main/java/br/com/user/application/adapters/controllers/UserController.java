package br.com.user.application.adapters.controllers;


import br.com.user.domain.dtos.UserDTO;
import br.com.user.domain.ports.interfaces.UserServicePort;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("users")
public class UserController {

    private final UserServicePort userServicePort;

    public UserController(UserServicePort userServicePort)
    {
        this.userServicePort = userServicePort;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<UserDTO> getUsers()
    {
        return userServicePort.buscaUser();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public UserDTO getByIdUser(@PathVariable UUID id)
    {
        return userServicePort.buscaUserByID(id);
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(@RequestBody @Valid UserDTO userDTO)
    {
        userServicePort.criarUser(userDTO);
    }

}
