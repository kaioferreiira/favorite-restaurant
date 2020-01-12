package br.com.favoriterestaurant.business.service.contracts;


import java.util.List;
import java.util.Optional;

import br.com.favoriterestaurant.business.dto.UserDTO;
import br.com.favoriterestaurant.business.entity.Usuario;

public interface UserService {

    List<UserDTO> findAllUsers();

    Optional<Usuario> findUser(Long idUser);

    void addUser(UserDTO userDTO);

    void updateUser(Long idUser, UserDTO userDTO);

//    boolean isAssociadoAutorizadoVoto(String cpf);
}
