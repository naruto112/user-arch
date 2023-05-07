package br.com.user.domain;

import br.com.user.domain.NomeCompleto;
import br.com.user.domain.UserId;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;

@Builder(toBuilder = true)
@Getter(AccessLevel.PACKAGE)
public class User  implements Serializable {

    private final UserId id;

    @NotNull
    private final NomeCompleto nomeCompleto;


    @NotNull
    private final Email email;

}
