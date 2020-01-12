package br.com.favoriterestaurant.business.reposity;

import br.com.favoriterestaurant.business.entity.Rodada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoundRepository extends JpaRepository<Rodada, Long> {


}
