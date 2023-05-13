package br.com.user.domain;

import br.com.user.domain.dtos.UserDTO;

import java.util.UUID;

public class User {

    private UUID userId;
    private String primeiroNome;
    private String segundoNome;
    private String emailContato;
    private Long telefoneContato;

    public User(UUID userId, String primeiroNome, String segundoNome, String emailContato, Long telefoneContato)
    {
        this.userId = userId;
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
        this.emailContato = emailContato;
        this.telefoneContato = telefoneContato;
    }

    public UUID getUserId() {
        return userId;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public String getSegundoNome() {
        return segundoNome;
    }

    public String getEmailContato() {
        return emailContato;
    }

    public Long getTelefoneContato() {
        return telefoneContato;
    }

    public User(UserDTO userDTO) {
        this.primeiroNome = userDTO.getPrimeiroNome();
        this.segundoNome = userDTO.getSegundoNome();
        this.emailContato = userDTO.getEmailContato();
        this.telefoneContato = userDTO.getTelefoneContato();
    }

    public UserDTO toUserDTO()
    {
        return new UserDTO(this.primeiroNome, this.segundoNome, this.emailContato, this.telefoneContato);
    }

}
