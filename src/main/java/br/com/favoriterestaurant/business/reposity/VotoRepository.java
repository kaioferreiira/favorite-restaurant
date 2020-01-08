package br.com.favoriterestaurant.business.reposity;

import br.com.favoriterestaurant.business.entity.Voto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VotoRepository extends JpaRepository<Voto, Long> {

//    @Query("SELECT cr.id_restaurante, count(*) FROM VOTO v\n"
//            + "INNER JOIN CANDIDATO_RODADA cr ON cr.id = v.id_candidato_rodada\n"
//            + "where cr.id_rodada = id \n"
//            + "group by cr.id_restaurante")
//    public List<Objects[]> listaTotalVotosPorRodada(Long id);

}
