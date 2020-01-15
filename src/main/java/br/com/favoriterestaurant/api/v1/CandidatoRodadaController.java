package br.com.favoriterestaurant.api.v1;

import java.util.List;
import java.util.Objects;

import br.com.favoriterestaurant.business.dto.FacilitadorDTO;
import br.com.favoriterestaurant.business.service.FacilitadorServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(CandidatoRodadaController.CANDIDATO_RODADA_CONTROLLER)
public class CandidatoRodadaController {

    static final String CANDIDATO_RODADA_CONTROLLER = "/v1/candidato-rodada";
    private static final Logger LOGGER = LoggerFactory.getLogger(CandidatoRodadaController.class);

    @Autowired
    private FacilitadorServiceImpl facilitadorService;

    @GetMapping(path = "/find-all",
            produces = "application/vnd.favorite.restaurant.facilitador-v1+json"
    )
    @ApiOperation(value = "Retorna todos facilitadores cadastrados", response = FacilitadorDTO.class)
    public ResponseEntity<List<FacilitadorDTO>> findAllFacilitadores() {

//        logRequest(LOGGER, GET, "/");

        ResponseEntity<List<FacilitadorDTO>> response = ResponseEntity.ok(facilitadorService.findAllFacilitadores());

        if (Objects.isNull(response.getBody())) {
            response = ResponseEntity.noContent().build();
        }

//        logResponse(LOGGER, GET, "/", response);

        return response;
    }


}
