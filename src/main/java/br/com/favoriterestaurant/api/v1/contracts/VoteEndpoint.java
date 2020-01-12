package br.com.favoriterestaurant.api.v1.contracts;


import br.com.favoriterestaurant.business.dto.VoteInputDTO;
import org.springframework.http.ResponseEntity;

public interface VoteEndpoint {

    ResponseEntity<Void> voteRoundCandidate(VoteInputDTO voteInputDTO);

}
