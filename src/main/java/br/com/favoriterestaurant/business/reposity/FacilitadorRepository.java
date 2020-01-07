package br.com.favoriterestaurant.business.reposity;

import br.com.favoriterestaurant.business.entity.Facilitador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacilitadorRepository extends JpaRepository<Facilitador, Long> {


}
