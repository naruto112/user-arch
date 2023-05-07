package br.com.user.domain;


import java.util.Objects;
import java.util.function.Function;

public class UserFunctions {

    private UserFunctions(){
        super();
    }

    public static Function<User, Integer> userIdAsInt =
           user -> Objects.isNull(user.getId()) ? null : user.getId().getIntValue();

    public static final Function<NomeCompleto, String> primeiroNome = NomeCompleto::getPrimeirNome;

    public static final Function<NomeCompleto, String> segundoNome = NomeCompleto::getSegundoNome;

    private static final Function<Email, String> email = Email::getEmail;

    public static Function<User, String> userPrimeiroNome = primeiroNome.compose(User::getNomeCompleto);

    public static Function<User, String> userSegundoNome = segundoNome.compose(User::getNomeCompleto);

    public static Function<User, String> userEmail = email.compose(User::getEmail);
}
