package br.com.favoriterestaurant.business.service;

import java.util.List;

import br.com.favoriterestaurant.business.entity.CandidatoRodada;
import br.com.favoriterestaurant.business.reposity.CandidateRoundRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidateServiceImpl {


    @Autowired
    private CandidateRoundRepository candidateRoundRepository;

    public List<CandidatoRodada> findAllCandidates() {
        List<CandidatoRodada> allCandidates = candidateRoundRepository.findAll();

        return allCandidates;
    }


}
