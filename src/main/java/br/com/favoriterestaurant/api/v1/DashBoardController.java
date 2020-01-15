package br.com.favoriterestaurant.api.v1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(DashBoardController.PATH_CONTROLLER)
public class DashBoardController {

    static final String PATH_CONTROLLER = "/v1/dashboard";
    private static final Logger LOGGER = LoggerFactory.getLogger(DashBoardController.class);

    //Busca resultado consolidados das votacoes em uma rodada

}
