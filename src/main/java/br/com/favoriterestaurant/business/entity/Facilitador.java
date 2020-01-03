package br.com.favoriterestaurant.business.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Facilitador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFacilitador;

    public Facilitador() {
    }

    public Facilitador(Integer idFacilitador) {
        this.idFacilitador = idFacilitador;
    }

    public Integer getIdFacilitador() {
        return idFacilitador;
    }

    public void setIdFacilitador(Integer idFacilitador) {
        this.idFacilitador = idFacilitador;
    }
}
