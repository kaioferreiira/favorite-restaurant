package br.com.favoriterestaurant.business.entity.converter;


import static br.com.favoriterestaurant.business.exception.VotacaoExceptionMessage.ERROR_FACILITADOR_INVALID_DATA;

import java.util.Objects;

import br.com.favoriterestaurant.business.dto.FacilitadorDTO;
import br.com.favoriterestaurant.business.entity.Facilitador;
import br.com.favoriterestaurant.business.exception.exceptions.ValidationException;
import org.springframework.stereotype.Component;

@Component
public abstract class FacilitadorConverter {

    public static FacilitadorDTO toDTO(Facilitador facilitador) {
        if (Objects.isNull(facilitador)) {
            return null;
        }
        return new FacilitadorDTO(facilitador.getNome());
    }


    public static Facilitador toFacilitador(FacilitadorDTO facilitadorDTO) {
        if (Objects.isNull(facilitadorDTO)) {
            throw new ValidationException(ERROR_FACILITADOR_INVALID_DATA);
        }

        return new Facilitador(null, facilitadorDTO.getNome(), null);
    }

}
