package br.com.favoriterestaurant.api.v1;

import java.util.List;
import java.util.Objects;

import br.com.favoriterestaurant.api.v1.contracts.UserEndpoint;
import br.com.favoriterestaurant.business.dto.UserDTO;
import br.com.favoriterestaurant.business.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(UserController.USER_CONTROLLER)
public class UserController implements UserEndpoint {

    static final String USER_CONTROLLER = "/v1/user";

    @Autowired
    private UserService userService;

    @Override
    @GetMapping(path = "/findAll",
            produces = "application/vnd.favorite.restaurant-v1+json"
    )
    @ApiOperation(value = "Retorna todos usuários cadastrados", response = UserDTO.class)
    public ResponseEntity<List<UserDTO>> findAllUsers() {

        ResponseEntity<List<UserDTO>> response = ResponseEntity.ok(userService.findAllUsers());

        if (Objects.isNull(response.getBody())) {
            response = ResponseEntity.noContent().build();
        }

        return response;
    }

    @Override
    public ResponseEntity<UserDTO> findUserById(Long idUser) {
        return null;
    }

    @Override
    public ResponseEntity<Void> addNewUser(UserDTO userDTO) {
        return null;
    }

    @Override
    public ResponseEntity<Void> updateUser(Long idUser, UserDTO userDTO) {
        return null;
    }

}
