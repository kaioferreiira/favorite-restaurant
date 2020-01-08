package br.com.favoriterestaurant.business.service;


import java.util.List;
import java.util.Optional;

import br.com.favoriterestaurant.business.dto.UserDTO;

public interface UserService {

    List<UserDTO> findAllUsers();

    Optional<UserDTO> findUser(Long idUser);

    void addUser(UserDTO userDTO);

    void updateUser(Long idUser, UserDTO userDTO);

//    boolean isAssociadoAutorizadoVoto(String cpf);
}
