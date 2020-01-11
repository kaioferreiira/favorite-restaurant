package br.com.favoriterestaurant.business.entity.converter;


import static br.com.favoriterestaurant.business.exception.VotacaoExceptionMessage.ERROR_USER_INVALID_DATA;

import java.util.Objects;

import br.com.favoriterestaurant.business.dto.UserDTO;
import br.com.favoriterestaurant.business.entity.Usuario;
import br.com.favoriterestaurant.business.exception.exceptions.ValidationException;
import org.springframework.stereotype.Component;

@Component
public abstract class UserConverter {

    public static UserDTO toDTO(Usuario usuario) {
        if (Objects.isNull(usuario)) {
            return null;
        }
        return new UserDTO(usuario.getNome());
    }


    public static Usuario toUsuario(UserDTO userDTO) {
        if (Objects.isNull(userDTO)) {
            throw new ValidationException(ERROR_USER_INVALID_DATA);
        }

        return new Usuario(null, userDTO.getNome());
    }


}
