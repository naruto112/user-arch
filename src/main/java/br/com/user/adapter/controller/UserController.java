package br.com.user.adapter.controller;


import br.com.user.adapter.controller.model.SaveUserBodyDTO;
import br.com.user.adapter.controller.model.UserDto;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final ChangeUserEndPointAdapter changeUserEndpointAdapter;

    UserController(ChangeUserEndPointAdapter changeUserEndPointAdapter) {
        this.changeUserEndpointAdapter = changeUserEndPointAdapter;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserDto saveUser(@RequestBody @Valid SaveUserBodyDTO saveUserBodyDTO) {
        return changeUserEndpointAdapter.saverUser(saveUserBodyDTO);
    }

}
