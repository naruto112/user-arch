package br.com.user.domain;


import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Value;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Getter
@Value(staticConstructor = "of")
public class Email {

    private static final Pattern PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");

    @NotNull
    String email;

    public static Email of(String email) {
        Matcher matcher = PATTERN.matcher(email);
        if (matcher.find()) {
            return of(email);
        }
        throw new IllegalArgumentException("Email não está valido");
    }
}
