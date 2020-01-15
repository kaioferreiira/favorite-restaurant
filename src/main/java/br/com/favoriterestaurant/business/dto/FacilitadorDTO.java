package br.com.favoriterestaurant.business.dto;

public class FacilitadorDTO {

    private String nome;

    public FacilitadorDTO() {
    }

    public FacilitadorDTO(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "FacilitadorDTO{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
