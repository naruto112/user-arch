package br.com.user.domain;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter(AccessLevel.PACKAGE)
@Value(staticConstructor = "of")
public class NomeCompleto {

    @NotNull
    String primeirNome;

    String segundoNome;
}
