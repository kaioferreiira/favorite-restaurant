package br.com.favoriterestaurant.business.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Rodada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idRodada;

    @OneToOne
    private Facilitador facilitador;

    @OneToMany(mappedBy = "idCandidatoRodada")
    private List<CanditatoRodada> canditatoRodadas;

    public Rodada() {
    }

    public Rodada(long idRodada, Facilitador facilitador) {
        this.idRodada = idRodada;
        this.facilitador = facilitador;
    }

    public List<CanditatoRodada> getCanditatoRodadas() {
        return canditatoRodadas;
    }

    public void setCanditatoRodadas(List<CanditatoRodada> canditatoRodadas) {
        this.canditatoRodadas = canditatoRodadas;
    }

    public long getIdRodada() {
        return idRodada;
    }

    public void setIdRodada(long idRodada) {
        this.idRodada = idRodada;
    }

    public Facilitador getFacilitador() {
        return facilitador;
    }

    public void setFacilitador(Facilitador facilitador) {
        this.facilitador = facilitador;
    }
}
