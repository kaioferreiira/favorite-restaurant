package br.com.favoriterestaurant.api.v1;

import static br.com.favoriterestaurant.business.utils.LoggerUtils.logRequest;
import static br.com.favoriterestaurant.business.utils.LoggerUtils.logResponse;
import static org.springframework.http.HttpMethod.GET;

import java.util.List;
import java.util.Objects;

import br.com.favoriterestaurant.api.v1.contracts.UserEndpoint;
import br.com.favoriterestaurant.business.dto.UserDTO;
import br.com.favoriterestaurant.business.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(UserController.USER_CONTROLLER)
public class UserController implements UserEndpoint {

    static final String USER_CONTROLLER = "/v1/user";

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);


    @Autowired
    private UserService userService;

    @Override
    @GetMapping(path = "/findAll",
            produces = "application/vnd.favorite.restaurant-v1+json"
    )
    @ApiOperation(value = "Retorna todos usuários cadastrados", response = UserDTO.class)
    public ResponseEntity<List<UserDTO>> findAllUsers() {

        logRequest(LOGGER, GET, "/");

        ResponseEntity<List<UserDTO>> response = ResponseEntity.ok(userService.findAllUsers());

        if (Objects.isNull(response.getBody())) {
            response = ResponseEntity.noContent().build();
        }

        logResponse(LOGGER, GET, "/", response);

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

    @Override
    public ResponseEntity<Void> deleteUser(Long idUser) {
        return null;
    }

}
