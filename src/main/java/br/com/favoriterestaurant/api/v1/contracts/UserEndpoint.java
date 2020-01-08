package br.com.favoriterestaurant.api.v1.contracts;

import java.util.List;

import br.com.favoriterestaurant.business.dto.UserDTO;
import org.springframework.http.ResponseEntity;

public interface UserEndpoint {

    ResponseEntity<List<UserDTO>> findAllUsers();

    ResponseEntity<UserDTO> findUserById(Long idUser);

    ResponseEntity<Void> addNewUser(UserDTO userDTO);

    ResponseEntity<Void> updateUser(Long idUser, UserDTO userDTO);

}
