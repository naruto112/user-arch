package br.com.user.domain.ports.interfaces;

import br.com.user.domain.dtos.UserDTO;
import java.util.List;
import java.util.UUID;

public interface UserServicePort {

    List<UserDTO> buscaUser();

    UserDTO buscaUserByID(UUID id);

    void criarUser(UserDTO userDTO);

    void atualizarUser(UserDTO userDTO);
}
