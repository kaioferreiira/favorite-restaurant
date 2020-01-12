package br.com.favoriterestaurant.business.dto;

public class VoteInputDTO {

    private  Long idUser;
    private  Long idRodadaCandidate;
    private  Long idRodada;

    public VoteInputDTO() {
    }

    public VoteInputDTO(Long idUser, Long idRodadaCandidate, Long idRodada) {
        this.idUser = idUser;
        this.idRodadaCandidate = idRodadaCandidate;
        this.idRodada = idRodada;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public Long getIdRodadaCandidate() {
        return idRodadaCandidate;
    }

    public void setIdRodadaCandidate(Long idRodadaCandidate) {
        this.idRodadaCandidate = idRodadaCandidate;
    }

    public Long getIdRodada() {
        return idRodada;
    }

    public void setIdRodada(Long idRodada) {
        this.idRodada = idRodada;
    }
}
