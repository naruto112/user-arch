package br.com.user.domain.ports.interfaces;

import br.com.user.domain.dtos.UserDTO;
import java.util.List;

public interface UserServicePort {

    List<UserDTO> buscaUser();

    void criarUser(UserDTO userDTO);

    void atualizarUser(UserDTO userDTO);
}
