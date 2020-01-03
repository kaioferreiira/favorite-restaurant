package br.com.favoriterestaurant.business.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Restaurante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idRestaurante;

    public Restaurante() {
    }

    public Restaurante(long idRestaurante) {
        this.idRestaurante = idRestaurante;
    }

    public long getIdRestaurante() {
        return idRestaurante;
    }

    public void setIdRestaurante(long idRestaurante) {
        this.idRestaurante = idRestaurante;
    }
}
