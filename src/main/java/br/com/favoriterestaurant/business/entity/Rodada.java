package br.com.favoriterestaurant.business.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Rodada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRodada;

    private String nomeRodada;

    @OneToOne
    @JoinColumn(name = "id_facilitador")
    private Facilitador facilitador;

    @OneToMany(mappedBy = "rodada", cascade = CascadeType.ALL)
    private List<CandidatoRodada> canditatoRodadas;

    public Rodada() {
    }

    public Rodada(Long idRodada, String nomeRodada, Facilitador facilitador) {
        this.idRodada = idRodada;
        this.nomeRodada = nomeRodada;
        this.facilitador = facilitador;
    }

    public Long getIdRodada() {
        return idRodada;
    }

    public void setIdRodada(Long idRodada) {
        this.idRodada = idRodada;
    }

    public String getNomeRodada() {
        return nomeRodada;
    }

    public void setNomeRodada(String nomeRodada) {
        this.nomeRodada = nomeRodada;
    }

    public Facilitador getFacilitador() {
        return facilitador;
    }

    public void setFacilitador(Facilitador facilitador) {
        this.facilitador = facilitador;
    }

    public List<CandidatoRodada> getCanditatoRodadas() {
        return canditatoRodadas;
    }

    public void setCanditatoRodadas(List<CandidatoRodada> canditatoRodadas) {
        this.canditatoRodadas = canditatoRodadas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rodada rodada = (Rodada) o;
        return Objects.equals(idRodada, rodada.idRodada);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRodada);
    }

    @Override
    public String toString() {
        return "Rodada{" +
                "idRodada=" + idRodada +
                ", nomeRodada='" + nomeRodada + '\'' +
                ", facilitador=" + facilitador +
                ", canditatoRodadas=" + canditatoRodadas +
                '}';
    }
}
