package br.com.user.adapter.controller.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserDto {

    private final  String primeiroNome;

    private final String segundoNome;

    private final String email;

}