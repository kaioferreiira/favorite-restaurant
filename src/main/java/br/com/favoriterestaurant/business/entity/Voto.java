package br.com.favoriterestaurant.business.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Voto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idVoto;

    @OneToOne
    private Usuario usuario;

    @OneToOne
    private CanditatoRodada canditatoRodada;

    public Voto() {
    }

    public Voto(long idVoto, Usuario usuario, CanditatoRodada canditatoRodada) {
        this.idVoto = idVoto;
        this.usuario = usuario;
        this.canditatoRodada = canditatoRodada;
    }

    public long getIdVoto() {
        return idVoto;
    }

    public void setIdVoto(long idVoto) {
        this.idVoto = idVoto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public CanditatoRodada getCanditatoRodada() {
        return canditatoRodada;
    }

    public void setCanditatoRodada(CanditatoRodada canditatoRodada) {
        this.canditatoRodada = canditatoRodada;
    }
}
