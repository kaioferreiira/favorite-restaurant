package br.com.favoriterestaurant.business.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Facilitador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFacilitador;

    private String nome;

    @OneToOne(mappedBy = "facilitador")
    private Rodada rodada;

    public Facilitador() {
    }

    public Facilitador(Long idFacilitador, String nome, Rodada rodada) {
        this.idFacilitador = idFacilitador;
        this.nome = nome;
        this.rodada = rodada;
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

    public Rodada getRodada() {
        return rodada;
    }

    public void setRodada(Rodada rodada) {
        this.rodada = rodada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facilitador that = (Facilitador) o;
        return Objects.equals(idFacilitador, that.idFacilitador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFacilitador);
    }

//    @Override
//    public String toString() {
//        return "Facilitador{" +
//                "idFacilitador=" + idFacilitador +
//                ", nome='" + nome + '\'' +
//                ", rodada=" + rodada +
//                '}';
//    }
}
