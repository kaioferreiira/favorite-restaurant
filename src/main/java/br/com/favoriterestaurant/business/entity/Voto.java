package br.com.favoriterestaurant.business.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Voto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_candidato_rodada")
    private CandidatoRodada candidatoRodada;

    public Voto() {
    }

    public Voto(Long id, Usuario usuario, CandidatoRodada candidatoRodada) {
        this.id = id;
        this.usuario = usuario;
        this.candidatoRodada = candidatoRodada;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public CandidatoRodada getCandidatoRodada() {
        return candidatoRodada;
    }

    public void setCandidatoRodada(CandidatoRodada candidatoRodada) {
        this.candidatoRodada = candidatoRodada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voto voto = (Voto) o;
        return Objects.equals(id, voto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Voto{" +
                "id=" + id +
                ", usuario=" + usuario +
                ", candidatoRodada=" + candidatoRodada +
                '}';
    }
}
