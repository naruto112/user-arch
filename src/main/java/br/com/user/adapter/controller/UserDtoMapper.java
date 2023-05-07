package br.com.user.adapter.controller;

import br.com.user.adapter.controller.model.SaveUserBodyDTO;
import br.com.user.adapter.controller.model.UserDto;
import br.com.user.domain.Email;
import br.com.user.domain.NomeCompleto;
import br.com.user.domain.User;
import br.com.user.infrastructure.annotations.Mapper;

import static br.com.user.domain.UserFunctions.userPrimeiroNome;
import static br.com.user.domain.UserFunctions.userSegundoNome;
import static br.com.user.domain.UserFunctions.userEmail;


@Mapper
class UserDtoMapper {

    UserDtoMapper() {super();}

    UserDto toDto(User user) {
        return  UserDto.builder()
                .primeiroNome(userPrimeiroNome.apply(user))
                .segundoNome(userSegundoNome.apply(user))
                .email(userEmail.apply(user))
                .build();
    }

    User toDomainFromSaveBody(SaveUserBodyDTO saveUserBodyDTO) {
        return User.builder()
                .nomeCompleto(NomeCompleto.of(saveUserBodyDTO.getPrimeiroNome(), null, saveUserBodyDTO.getSegundoNome()))
                .email(Email.of(saveUserBodyDTO.getEmail()))
                .build();
    }

}
