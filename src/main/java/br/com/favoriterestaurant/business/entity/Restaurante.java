package br.com.favoriterestaurant.business.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Restaurante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRestaurante;

    private String nome;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "restaurante")
    private List<CanditatoRodada> canditatoRodadaList;


    public Restaurante() {
    }

    public Restaurante(Long idRestaurante, String nome, List<CanditatoRodada> canditatoRodadaList) {
        this.idRestaurante = idRestaurante;
        this.nome = nome;
        this.canditatoRodadaList = canditatoRodadaList;
    }

    public Restaurante(Long idRestaurante) {
        this.idRestaurante = idRestaurante;
    }

    public long getIdRestaurante() {
        return idRestaurante;
    }

    public void setIdRestaurante(Long idRestaurante) {
        this.idRestaurante = idRestaurante;
    }

    public List<CanditatoRodada> getCanditatoRodadaList() {
        return canditatoRodadaList;
    }

    public void setCanditatoRodadaList(List<CanditatoRodada> canditatoRodadaList) {
        this.canditatoRodadaList = canditatoRodadaList;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
