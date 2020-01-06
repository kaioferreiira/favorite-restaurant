package br.com.favoriterestaurant.business.reposity;

import br.com.favoriterestaurant.business.entity.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {


}
