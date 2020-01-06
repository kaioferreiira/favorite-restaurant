package br.com.favoriterestaurant.business.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Rodada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRodada;

    @OneToOne
    @JoinColumn(name = "id_facilitador")
    private Facilitador facilitador;

    @OneToMany(mappedBy = "idCandidatoRodada")
    private List<CanditatoRodada> canditatoRodadas;

    public Rodada() {
    }

    public Rodada(Long idRodada, Facilitador facilitador) {
        this.idRodada = idRodada;
        this.facilitador = facilitador;
    }

    public List<CanditatoRodada> getCanditatoRodadas() {
        return canditatoRodadas;
    }

    public void setCanditatoRodadas(List<CanditatoRodada> canditatoRodadas) {
        this.canditatoRodadas = canditatoRodadas;
    }

    public Long getIdRodada() {
        return idRodada;
    }

    public void setIdRodada(Long idRodada) {
        this.idRodada = idRodada;
    }

    public Facilitador getFacilitador() {
        return facilitador;
    }

    public void setFacilitador(Facilitador facilitador) {
        this.facilitador = facilitador;
    }
}
