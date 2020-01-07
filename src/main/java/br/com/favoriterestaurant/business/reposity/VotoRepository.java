package br.com.favoriterestaurant.business.reposity;

import br.com.favoriterestaurant.business.entity.Voto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VotoRepository extends JpaRepository<Voto, Long> {


}
