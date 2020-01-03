package br.com.favoriterestaurant.business.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CanditatoRodada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCandidatoRodada;

    @ManyToOne
    private Restaurante restaurante;

    @ManyToOne
    @JoinColumn(name = "idRodada")
    private Rodada rodada;


    public CanditatoRodada() {
    }

    public CanditatoRodada(long idCandidatoRodada, Restaurante restaurante, Rodada rodada) {
        this.idCandidatoRodada = idCandidatoRodada;
        this.restaurante = restaurante;
        this.rodada = rodada;
    }

    public long getIdCandidatoRodada() {
        return idCandidatoRodada;
    }

    public void setIdCandidatoRodada(long idCandidatoRodada) {
        this.idCandidatoRodada = idCandidatoRodada;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public Rodada getRodada() {
        return rodada;
    }

    public void setRodada(Rodada rodada) {
        this.rodada = rodada;
    }
}
