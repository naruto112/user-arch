package br.com.user.infrastructure.adapters.entity;

import br.com.user.domain.User;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID userId;
    private String primeiroNome;
    private String segundoNome;
    private String emailContato;
    private Number telefoneContato;

    public UserEntity(){}

    public UserEntity(User user) {
        this.primeiroNome = user.getPrimeiroNome();
        this.segundoNome = user.getSegundoNome();
        this.emailContato = user.getEmailContato();
        this.telefoneContato = user.getTelefoneContato();
    }

    public void updateUser(User user)
    {
        this.primeiroNome = user.getPrimeiroNome();
        this.segundoNome = user.getSegundoNome();
        this.emailContato = user.getEmailContato();
        this.telefoneContato = user.getTelefoneContato();
    }

    public User toUser()
    {
        return new User(this.userId, this.primeiroNome, this.segundoNome, this.emailContato, this.telefoneContato);
    }

}
