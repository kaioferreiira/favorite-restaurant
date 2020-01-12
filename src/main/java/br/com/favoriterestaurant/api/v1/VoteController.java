package br.com.favoriterestaurant.api.v1;

import static br.com.favoriterestaurant.business.utils.LoggerUtils.logRequest;
import static br.com.favoriterestaurant.business.utils.LoggerUtils.logResponse;
import static org.springframework.http.HttpMethod.GET;
import static org.springframework.http.HttpMethod.POST;

import java.util.List;
import java.util.Objects;

import br.com.favoriterestaurant.api.v1.contracts.VoteEndpoint;
import br.com.favoriterestaurant.business.dto.UserDTO;
import br.com.favoriterestaurant.business.dto.VoteInputDTO;
import br.com.favoriterestaurant.business.service.contracts.VoteService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(VoteController.VOTE_CONTROLLER)
public class VoteController implements VoteEndpoint {

    static final String VOTE_CONTROLLER = "/v1/vote";
    private static final Logger LOGGER = LoggerFactory.getLogger(VoteController.class);

    @Autowired
    private VoteService voteService;

//    @Override
//    @GetMapping(path = "/findAll",
//            produces = "application/vnd.favorite.restaurant-v1+json"
//    )
//    @ApiOperation(value = "Retorna todos usuários cadastrados", response = UserDTO.class)
//    public ResponseEntity<List<UserDTO>> findAllUsers() {
//
//        logRequest(LOGGER, GET, "/");
//
//        ResponseEntity<List<UserDTO>> response = ResponseEntity.ok(userService.findAllUsers());
//
//        if (Objects.isNull(response.getBody())) {
//            response = ResponseEntity.noContent().build();
//        }
//
//        logResponse(LOGGER, GET, "/", response);
//
//        return response;
//    }

    @PostMapping(path = "/vote-round-candidate",
            produces = "application/vnd.favorite.restaurant-v1+json")
    @ApiOperation(value = "Take a vote on the round's candidate", response = VoteInputDTO.class)
    public ResponseEntity<Void> voteRoundCandidate(@RequestBody VoteInputDTO voteInputDTO) {

        logRequest(LOGGER, POST, "/", voteInputDTO);

        voteService.addANewVote(voteInputDTO);

        logResponse(LOGGER, POST, "/");

        return ResponseEntity.ok().build();
    }

}
