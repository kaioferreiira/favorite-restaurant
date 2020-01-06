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
    private Long idCandidatoRodada;

    @ManyToOne
    @JoinColumn(name = "id_restaurante")
    private Restaurante restaurante;

    @ManyToOne
    @JoinColumn(name = "id_rodada")
    private Rodada rodada;


    public CanditatoRodada() {
    }

    public CanditatoRodada(Long idCandidatoRodada, Restaurante restaurante, Rodada rodada) {
        this.idCandidatoRodada = idCandidatoRodada;
        this.restaurante = restaurante;
        this.rodada = rodada;
    }

    public Long getIdCandidatoRodada() {
        return idCandidatoRodada;
    }

    public void setIdCandidatoRodada(Long idCandidatoRodada) {
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
