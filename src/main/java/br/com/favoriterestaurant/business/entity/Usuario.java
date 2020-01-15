package br.com.favoriterestaurant.business.entity;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    @Column(name = "nome")
    private String nome;

    @Column(name = "voto")
    private Boolean voto;

    private LocalDate dataVoto;

    public Usuario() {
    }

    public Usuario(Long idUsuario, String nome, LocalDate dataVoto) {
        this.idUsuario = idUsuario;
        this.dataVoto = dataVoto;
        this.nome = nome;
    }

    public Usuario(Long idUsuario, String nome) {
        this.idUsuario = idUsuario;
        this.nome = nome;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getVoto() {
        return voto;
    }

    public void setVoto(Boolean voto) {
        this.voto = voto;
    }

    public LocalDate getDataVoto() {
        return dataVoto;
    }

    public void setDataVoto(LocalDate dataVoto) {
        this.dataVoto = dataVoto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(idUsuario, usuario.idUsuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsuario);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", nome='" + nome + '\'' +
                ", voto=" + voto +
                ", dataVoto=" + dataVoto +
                '}';
    }
}
