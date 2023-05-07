package br.com.user.domain.dtos;

import java.util.UUID;

public class UserDTO {

    private String primeiroNome;
    private String segundoNome;
    private String emailContato;
    private Number telefoneContato;

    public UserDTO(String primeiroNome, String segundoNome, String emailContato, Number telefoneContato)
    {
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
        this.emailContato = emailContato;
        this.telefoneContato = telefoneContato;
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

    public Number getTelefoneContato() {
        return telefoneContato;
    }

}
