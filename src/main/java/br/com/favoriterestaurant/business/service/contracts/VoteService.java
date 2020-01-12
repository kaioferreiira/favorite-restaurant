package br.com.favoriterestaurant.business.service.contracts;

import br.com.favoriterestaurant.business.dto.VoteInputDTO;
import br.com.favoriterestaurant.business.entity.Voto;

public interface VoteService {

//    List<UserDTO> findAllUsers();

//    Optional<UserDTO> findUser(Long idUser);

    void addANewVote(VoteInputDTO voteInputDTO);

    void addVote(Voto voto);

//    void updateUser(Long idUser, UserDTO userDTO);

//    boolean isAssociadoAutorizadoVoto(String cpf);
}
