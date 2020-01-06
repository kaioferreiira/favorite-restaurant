package br.com.favoriterestaurant.business.reposity;

import br.com.favoriterestaurant.business.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {


}
