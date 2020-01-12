package br.com.favoriterestaurant.business.service;

import static br.com.favoriterestaurant.business.exception.VotacaoExceptionMessage.ERROR_USER_NOT_FOUND;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import br.com.favoriterestaurant.business.dto.UserDTO;
import br.com.favoriterestaurant.business.dto.VoteInputDTO;
import br.com.favoriterestaurant.business.entity.CandidatoRodada;
import br.com.favoriterestaurant.business.entity.Rodada;
import br.com.favoriterestaurant.business.entity.Usuario;
import br.com.favoriterestaurant.business.entity.Voto;
import br.com.favoriterestaurant.business.exception.exceptions.ObjectNotFoundException;
import br.com.favoriterestaurant.business.reposity.RoundRepository;
import br.com.favoriterestaurant.business.reposity.VotoRepository;
import br.com.favoriterestaurant.business.service.contracts.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoteServiceImpl  implements VoteService {


    private UserServiceImpl userService;
    private CandidateServiceImpl  candidateService;
    private VotoRepository votoRepository;
    private RoundRepository roundRepository;

    @Autowired
    public VoteServiceImpl(UserServiceImpl userService, CandidateServiceImpl candidateService,
            VotoRepository votoRepository,RoundRepository roundRepository) {
        this.userService = userService;
        this.candidateService = candidateService;
        this.votoRepository = votoRepository;
        this.roundRepository = roundRepository;
    }

    @Override
    public void addANewVote(VoteInputDTO voteInputDTO) {

        //find user banco
        Usuario user =
                userService.findUser(voteInputDTO.getIdUser()).orElseThrow(() -> new ObjectNotFoundException(ERROR_USER_NOT_FOUND));
        //converter user dto to user;

        //find round required
        Optional<Rodada> roundRepositoryById = roundRepository.findById(1l);

        //find candidate roud required
        Optional<CandidatoRodada> candidateRoud =
                roundRepositoryById.get().getCanditatoRodadas().stream().filter(candidatoRodada -> candidatoRodada.getId().equals(voteInputDTO.getIdRodadaCandidate())).findFirst();



        Voto voto = new Voto(null, new Usuario(user.getIdUsuario(),user.getNome()), candidateRoud.get());

        addVote(voto);
    }

    @Override
    public void addVote(Voto voto) {
        votoRepository.save(voto);

    }
}
