package br.com.favoriterestaurant.business.reposity;

import java.util.List;
import java.util.Objects;

import br.com.favoriterestaurant.business.entity.Usuario;
import br.com.favoriterestaurant.business.entity.Voto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface VotoRepository extends JpaRepository<Voto, Long> {

    @Query(value = "SELECT cr.id_restaurante, count(*) FROM VOTO v\n"
            + "INNER JOIN CANDIDATO_RODADA cr ON cr.id = v.id_candidato_rodada\n"
            + "where cr.id_rodada = :id \n"
            + "group by cr.id_restaurante", nativeQuery = true)
    public List<Objects[]> listaTotalVotosPorRodada(Long id);


    @Query(value = "SELECT * FROM CANDIDATO_RODADA CR\n"
            + "INNER JOIN VOTO V ON V.ID_CANDIDATO_RODADA = CR.ID\n"
            + " WHERE CR.ID_RODADA = :idRdodada\n"
            + " AND V.ID_USUARIO = :idUsuario ", nativeQuery = true)
    public Usuario usuarioJaVotou(Long idRdodada, Long idUsuario);


}
