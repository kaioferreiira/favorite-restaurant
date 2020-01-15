package br.com.favoriterestaurant.business.service;

import static br.com.favoriterestaurant.business.exception.VotacaoExceptionMessage.ERROR_FACILITADOR_NOT_FOUND;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import br.com.favoriterestaurant.business.dto.FacilitadorDTO;
import br.com.favoriterestaurant.business.dto.UserDTO;
import br.com.favoriterestaurant.business.entity.Facilitador;
import br.com.favoriterestaurant.business.entity.converter.FacilitadorConverter;
import br.com.favoriterestaurant.business.exception.exceptions.ValidationException;
import br.com.favoriterestaurant.business.reposity.FacilitadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacilitadorServiceImpl {

    @Autowired
    private FacilitadorRepository facilitadorRepository;



    public List<FacilitadorDTO> findAllFacilitadores(){
        return facilitadorRepository.findAll().stream().map(FacilitadorConverter::toDTO).collect(Collectors.toList());
    }

    public List<Facilitador> findAllCadastrados() {
        return facilitadorRepository.findAll();
    }

    public Optional<Facilitador> findFacilitador(Long idFacilitador) {

        Optional<Facilitador> facilitador = facilitadorRepository.findById(idFacilitador);
        if(!facilitador.isPresent()){
            throw new ValidationException(ERROR_FACILITADOR_NOT_FOUND);
        }
        return facilitador;
    }

    public void addFacilitador(FacilitadorDTO  facilitadorDTO) {
        Facilitador facilitador = FacilitadorConverter.toFacilitador(facilitadorDTO);
        saveFacilitador(facilitador);
    }
    public void saveFacilitador(Facilitador facilitador){
        facilitadorRepository.save(facilitador);
    }

    public void updateUser(Long idUser, UserDTO userDTO) {

    }
}
