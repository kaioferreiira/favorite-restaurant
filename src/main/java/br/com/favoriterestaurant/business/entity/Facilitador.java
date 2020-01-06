package br.com.favoriterestaurant.business.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Facilitador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFacilitador;

    private String nome;

    public Facilitador() {
    }

    public Facilitador(Long idFacilitador, String nome) {
        this.idFacilitador = idFacilitador;
        this.nome = nome;
    }

    public Long getIdFacilitador() {
        return idFacilitador;
    }

    public void setIdFacilitador(Long idFacilitador) {
        this.idFacilitador = idFacilitador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
