package br.com.favoriterestaurant.business.reposity;

import br.com.favoriterestaurant.business.entity.CandidatoRodada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidatoRodadaRepository extends JpaRepository<CandidatoRodada, Long> {


}
